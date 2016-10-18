(defproject kiara "0.1.0-SNAPSHOT"
  :description "RDF storage in Datomic"
  :url "http://github.com/quoll"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojars.quoll/turtle "0.2.2"]
                 [com.datomic/datomic-free "0.9.5394"]
                 [prismatic/schema "1.1.3"]]
  :main kiara.test-load
  
  :profiles {:test {:jvm-opts ["-Xms96m" "-Xmx1g" "-Ddatomic.objectCacheMax=128M" "-Ddatomic.memoryIndexMax=64M"]}}
  
  :jvm-opts ["-Xms96m" "-Xmx1g" "-Ddatomic.objectCacheMax=128m" "-Ddatomic.memoryIndexMax=64m"])

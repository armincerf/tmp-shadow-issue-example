
(ns app.main
  (:require ["myAppJsFiles/myJs.js" :refer [foo]]))

(defn main! []
  (println (foo)))

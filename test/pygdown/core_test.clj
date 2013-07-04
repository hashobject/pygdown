(ns pygdown.core-test
  (:use clojure.test
        pygdown.core))

(deftest serializer-test
  (testing "should return html"
    (is (= "<h3>Header</h3><p><div class=\"highlight\"><pre><span class=\"p\">(</span><span class=\"k\">def</span> <span class=\"nf\">x</span> <span class=\"mi\">1</span><span class=\"p\">)</span>\n</pre></div>\n</p>"
           (to-html "###Header\n```(def x 1)```")))))



(deftest serializer-for-content-from-file-test
  (testing "should return html"
    (let [md (slurp "test/pygdown/test.md")]
    (is (= "<h2>Install</h2><p><div class=\"highlight\"><pre><span class=\"p\">[</span><span class=\"n\">pygdown</span> <span class=\"s\">&quot;0.1.0-SNAPSHOT&quot;</span><span class=\"p\">]</span>\n</pre></div>\n</p>"
           (to-html md))))))

/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.Drop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Drop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.47f, 2.22f)
            curveTo(11.763f, 1.927f, 12.237f, 1.927f, 12.53f, 2.22f)
            curveTo(12.933f, 2.623f, 14.529f, 4.347f, 16.029f, 6.582f)
            curveTo(17.508f, 8.785f, 19f, 11.635f, 19f, 14.25f)
            curveTo(19f, 16.774f, 18.254f, 18.729f, 16.956f, 20.056f)
            curveTo(15.659f, 21.381f, 13.889f, 22f, 12f, 22f)
            curveTo(10.111f, 22f, 8.341f, 21.381f, 7.044f, 20.056f)
            curveTo(5.746f, 18.729f, 5f, 16.774f, 5f, 14.25f)
            curveTo(5f, 11.635f, 6.492f, 8.785f, 7.971f, 6.582f)
            curveTo(9.471f, 4.347f, 11.067f, 2.623f, 11.47f, 2.22f)
            close()
            moveTo(9.216f, 7.418f)
            curveTo(7.758f, 9.59f, 6.5f, 12.115f, 6.5f, 14.25f)
            curveTo(6.5f, 16.476f, 7.153f, 18.021f, 8.117f, 19.007f)
            curveTo(9.082f, 19.994f, 10.438f, 20.5f, 12f, 20.5f)
            curveTo(13.562f, 20.5f, 14.918f, 19.994f, 15.883f, 19.007f)
            curveTo(16.847f, 18.021f, 17.5f, 16.476f, 17.5f, 14.25f)
            curveTo(17.5f, 12.115f, 16.242f, 9.59f, 14.784f, 7.418f)
            curveTo(13.743f, 5.868f, 12.653f, 4.575f, 12f, 3.848f)
            curveTo(11.347f, 4.575f, 10.257f, 5.868f, 9.216f, 7.418f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DropPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Drop, contentDescription = null)
    }
}

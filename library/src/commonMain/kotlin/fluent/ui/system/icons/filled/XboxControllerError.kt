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
package fluent.ui.system.icons.filled

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

public val FluentUi.Filled.XboxControllerError: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.XboxControllerError",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.807f, 4.508f)
            curveTo(9.278f, 4.243f, 8.697f, 4.202f, 8.168f, 4.302f)
            lineTo(6.986f, 4.528f)
            curveTo(6.124f, 4.692f, 5.382f, 5.245f, 4.982f, 6.028f)
            curveTo(3.615f, 8.7f, 2.581f, 10.889f, 2.183f, 12.757f)
            curveTo(1.771f, 14.683f, 2.023f, 16.332f, 3.262f, 17.833f)
            curveTo(4.083f, 18.829f, 5.491f, 18.627f, 6.225f, 17.797f)
            curveTo(6.784f, 17.165f, 7.42f, 16.433f, 8.043f, 15.711f)
            curveTo(8.452f, 15.236f, 9.047f, 14.962f, 9.672f, 14.962f)
            horizontalLineTo(11.183f)
            curveTo(11.874f, 12.115f, 14.44f, 10f, 17.5f, 10f)
            curveTo(18.967f, 10f, 20.321f, 10.487f, 21.409f, 11.307f)
            curveTo(20.886f, 9.775f, 20.047f, 8.038f, 19.018f, 6.028f)
            curveTo(18.618f, 5.245f, 17.876f, 4.692f, 17.015f, 4.528f)
            lineTo(15.832f, 4.302f)
            curveTo(15.303f, 4.202f, 14.722f, 4.243f, 14.193f, 4.508f)
            curveTo(14.05f, 4.579f, 13.903f, 4.657f, 13.754f, 4.737f)
            curveTo(13.399f, 4.93f, 13.018f, 5.034f, 12.641f, 5.034f)
            horizontalLineTo(11.359f)
            curveTo(10.983f, 5.034f, 10.602f, 4.93f, 10.246f, 4.737f)
            curveTo(10.098f, 4.657f, 9.951f, 4.579f, 9.807f, 4.508f)
            close()
            moveTo(12f, 10f)
            curveTo(11.448f, 10f, 11f, 9.553f, 11f, 9f)
            curveTo(11f, 8.448f, 11.448f, 8f, 12f, 8f)
            curveTo(12.552f, 8f, 13f, 8.448f, 13f, 9f)
            curveTo(13f, 9.553f, 12.552f, 10f, 12f, 10f)
            close()
            moveTo(23f, 16.5f)
            curveTo(23f, 19.538f, 20.538f, 22f, 17.5f, 22f)
            curveTo(14.462f, 22f, 12f, 19.538f, 12f, 16.5f)
            curveTo(12f, 13.463f, 14.462f, 11f, 17.5f, 11f)
            curveTo(20.538f, 11f, 23f, 13.463f, 23f, 16.5f)
            close()
            moveTo(17.5f, 13f)
            curveTo(17.224f, 13f, 17f, 13.224f, 17f, 13.5f)
            verticalLineTo(17.5f)
            curveTo(17f, 17.777f, 17.224f, 18f, 17.5f, 18f)
            curveTo(17.776f, 18f, 18f, 17.777f, 18f, 17.5f)
            verticalLineTo(13.5f)
            curveTo(18f, 13.224f, 17.776f, 13f, 17.5f, 13f)
            close()
            moveTo(17.5f, 20.125f)
            curveTo(17.845f, 20.125f, 18.125f, 19.846f, 18.125f, 19.5f)
            curveTo(18.125f, 19.155f, 17.845f, 18.875f, 17.5f, 18.875f)
            curveTo(17.155f, 18.875f, 16.875f, 19.155f, 16.875f, 19.5f)
            curveTo(16.875f, 19.846f, 17.155f, 20.125f, 17.5f, 20.125f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun XboxControllerErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.XboxControllerError, contentDescription = null)
    }
}

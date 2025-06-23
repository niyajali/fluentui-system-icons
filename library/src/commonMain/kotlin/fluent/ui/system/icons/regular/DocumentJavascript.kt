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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.DocumentJavascript: ImageVector
    get() {
        if (_DocumentJavascript != null) {
            return _DocumentJavascript!!
        }
        _DocumentJavascript = ImageVector.Builder(
            name = "Regular.DocumentJavascript",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 20.5f)
                horizontalLineTo(10.966f)
                curveTo(10.879f, 21.07f, 10.628f, 21.587f, 10.264f, 22f)
                horizontalLineTo(18f)
                curveTo(19.104f, 22f, 20f, 21.104f, 20f, 20f)
                verticalLineTo(9.828f)
                curveTo(20f, 9.298f, 19.789f, 8.789f, 19.414f, 8.414f)
                lineTo(13.585f, 2.586f)
                curveTo(13.57f, 2.571f, 13.553f, 2.558f, 13.536f, 2.545f)
                curveTo(13.524f, 2.536f, 13.512f, 2.526f, 13.5f, 2.516f)
                curveTo(13.429f, 2.452f, 13.359f, 2.389f, 13.281f, 2.336f)
                curveTo(13.256f, 2.319f, 13.228f, 2.305f, 13.2f, 2.292f)
                curveTo(13.184f, 2.284f, 13.168f, 2.276f, 13.153f, 2.268f)
                curveTo(13.136f, 2.259f, 13.12f, 2.249f, 13.103f, 2.239f)
                curveTo(13.049f, 2.208f, 12.994f, 2.176f, 12.937f, 2.152f)
                curveTo(12.74f, 2.07f, 12.528f, 2.029f, 12.313f, 2.014f)
                curveTo(12.293f, 2.013f, 12.274f, 2.01f, 12.254f, 2.007f)
                curveTo(12.227f, 2.004f, 12.2f, 2f, 12.172f, 2f)
                horizontalLineTo(6f)
                curveTo(4.896f, 2f, 4f, 2.896f, 4f, 4f)
                verticalLineTo(14.018f)
                curveTo(4.082f, 14.006f, 4.165f, 14f, 4.25f, 14f)
                curveTo(4.74f, 14f, 5.182f, 14.201f, 5.5f, 14.525f)
                verticalLineTo(4f)
                curveTo(5.5f, 3.725f, 5.724f, 3.5f, 6f, 3.5f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                curveTo(12f, 9.104f, 12.896f, 10f, 14f, 10f)
                horizontalLineTo(18.5f)
                verticalLineTo(20f)
                curveTo(18.5f, 20.275f, 18.276f, 20.5f, 18f, 20.5f)
                close()
                moveTo(17.378f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.275f, 13.5f, 8f)
                verticalLineTo(4.621f)
                lineTo(17.378f, 8.5f)
                close()
                moveTo(4.25f, 15f)
                curveTo(4.664f, 15f, 5f, 15.336f, 5f, 15.75f)
                verticalLineTo(20f)
                curveTo(5f, 21.105f, 4.105f, 22f, 3f, 22f)
                curveTo(1.895f, 22f, 1f, 21.105f, 1f, 20f)
                verticalLineTo(19.75f)
                curveTo(1f, 19.336f, 1.336f, 19f, 1.75f, 19f)
                curveTo(2.164f, 19f, 2.5f, 19.336f, 2.5f, 19.75f)
                verticalLineTo(20f)
                curveTo(2.5f, 20.276f, 2.724f, 20.5f, 3f, 20.5f)
                curveTo(3.276f, 20.5f, 3.5f, 20.276f, 3.5f, 20f)
                verticalLineTo(15.75f)
                curveTo(3.5f, 15.336f, 3.836f, 15f, 4.25f, 15f)
                close()
                moveTo(7.95f, 15f)
                curveTo(6.873f, 15f, 6f, 15.873f, 6f, 16.95f)
                verticalLineTo(17.184f)
                curveTo(6f, 17.799f, 6.323f, 18.368f, 6.85f, 18.684f)
                lineTo(8.379f, 19.602f)
                curveTo(8.454f, 19.647f, 8.5f, 19.728f, 8.5f, 19.816f)
                verticalLineTo(20.05f)
                curveTo(8.5f, 20.299f, 8.299f, 20.5f, 8.05f, 20.5f)
                horizontalLineTo(7.95f)
                curveTo(7.701f, 20.5f, 7.5f, 20.299f, 7.5f, 20.05f)
                verticalLineTo(20f)
                curveTo(7.5f, 19.586f, 7.164f, 19.25f, 6.75f, 19.25f)
                curveTo(6.336f, 19.25f, 6f, 19.586f, 6f, 20f)
                verticalLineTo(20.05f)
                curveTo(6f, 21.127f, 6.873f, 22f, 7.95f, 22f)
                horizontalLineTo(8.05f)
                curveTo(9.127f, 22f, 10f, 21.127f, 10f, 20.05f)
                verticalLineTo(19.816f)
                curveTo(10f, 19.201f, 9.677f, 18.632f, 9.15f, 18.316f)
                lineTo(7.621f, 17.398f)
                curveTo(7.546f, 17.353f, 7.5f, 17.272f, 7.5f, 17.184f)
                verticalLineTo(16.95f)
                curveTo(7.5f, 16.701f, 7.701f, 16.5f, 7.95f, 16.5f)
                horizontalLineTo(8.05f)
                curveTo(8.299f, 16.5f, 8.5f, 16.701f, 8.5f, 16.95f)
                verticalLineTo(17f)
                curveTo(8.5f, 17.414f, 8.836f, 17.75f, 9.25f, 17.75f)
                curveTo(9.664f, 17.75f, 10f, 17.414f, 10f, 17f)
                verticalLineTo(16.95f)
                curveTo(10f, 15.873f, 9.127f, 15f, 8.05f, 15f)
                horizontalLineTo(7.95f)
                close()
            }
        }.build()

        return _DocumentJavascript!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentJavascript: ImageVector? = null

@Preview
@Composable
private fun DocumentJavascriptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentJavascript, contentDescription = null)
    }
}

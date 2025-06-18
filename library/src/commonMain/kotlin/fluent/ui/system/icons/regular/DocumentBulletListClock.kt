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

public val FluentUi.Regular.DocumentBulletListClock: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Regular.DocumentBulletListClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.414f, 8.414f)
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
                verticalLineTo(20f)
                curveTo(4f, 21.104f, 4.896f, 22f, 6f, 22f)
                horizontalLineTo(12.81f)
                curveTo(12.383f, 21.556f, 12.019f, 21.051f, 11.732f, 20.5f)
                horizontalLineTo(6f)
                curveTo(5.724f, 20.5f, 5.5f, 20.275f, 5.5f, 20f)
                verticalLineTo(4f)
                curveTo(5.5f, 3.725f, 5.724f, 3.5f, 6f, 3.5f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                curveTo(12f, 9.104f, 12.896f, 10f, 14f, 10f)
                horizontalLineTo(18.5f)
                verticalLineTo(11.076f)
                curveTo(19.023f, 11.157f, 19.526f, 11.3f, 20f, 11.498f)
                verticalLineTo(9.828f)
                curveTo(20f, 9.298f, 19.789f, 8.789f, 19.414f, 8.414f)
                close()
                moveTo(13.5f, 4.621f)
                lineTo(17.378f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.275f, 13.5f, 8f)
                verticalLineTo(4.621f)
                close()
                moveTo(10.75f, 17.5f)
                horizontalLineTo(11f)
                curveTo(11f, 18.016f, 11.06f, 18.518f, 11.174f, 19f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 19f, 10f, 18.664f, 10f, 18.25f)
                curveTo(10f, 17.836f, 10.336f, 17.5f, 10.75f, 17.5f)
                close()
                moveTo(11.174f, 16f)
                curveTo(11.299f, 15.472f, 11.488f, 14.969f, 11.732f, 14.5f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 14.5f, 10f, 14.836f, 10f, 15.25f)
                curveTo(10f, 15.664f, 10.336f, 16f, 10.75f, 16f)
                horizontalLineTo(11.174f)
                close()
                moveTo(12.81f, 13f)
                curveTo(13.423f, 12.361f, 14.166f, 11.847f, 14.996f, 11.5f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 11.5f, 10f, 11.836f, 10f, 12.25f)
                curveTo(10f, 12.664f, 10.336f, 13f, 10.75f, 13f)
                horizontalLineTo(12.81f)
                close()
                moveTo(7.75f, 11.5f)
                curveTo(7.336f, 11.5f, 7f, 11.836f, 7f, 12.25f)
                curveTo(7f, 12.664f, 7.336f, 13f, 7.75f, 13f)
                curveTo(8.164f, 13f, 8.5f, 12.664f, 8.5f, 12.25f)
                curveTo(8.5f, 11.836f, 8.164f, 11.5f, 7.75f, 11.5f)
                close()
                moveTo(7f, 15.25f)
                curveTo(7f, 14.836f, 7.336f, 14.5f, 7.75f, 14.5f)
                curveTo(8.164f, 14.5f, 8.5f, 14.836f, 8.5f, 15.25f)
                curveTo(8.5f, 15.664f, 8.164f, 16f, 7.75f, 16f)
                curveTo(7.336f, 16f, 7f, 15.664f, 7f, 15.25f)
                close()
                moveTo(7f, 18.25f)
                curveTo(7f, 17.836f, 7.336f, 17.5f, 7.75f, 17.5f)
                curveTo(8.164f, 17.5f, 8.5f, 17.836f, 8.5f, 18.25f)
                curveTo(8.5f, 18.664f, 8.164f, 19f, 7.75f, 19f)
                curveTo(7.336f, 19f, 7f, 18.664f, 7f, 18.25f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(17.221f, 17.917f)
                curveTo(17.085f, 17.828f, 16.996f, 17.674f, 16.996f, 17.5f)
                curveTo(16.996f, 17.476f, 16.998f, 17.452f, 17.001f, 17.429f)
                lineTo(17f, 13.499f)
                curveTo(17f, 13.223f, 17.224f, 12.999f, 17.5f, 12.999f)
                curveTo(17.776f, 12.999f, 18f, 13.223f, 18f, 13.499f)
                lineTo(18.001f, 17f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
                curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
                horizontalLineTo(17.561f)
                curveTo(17.541f, 18.002f, 17.521f, 18.003f, 17.501f, 18.003f)
                curveTo(17.397f, 18.003f, 17.301f, 17.972f, 17.221f, 17.917f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun DocumentBulletListClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentBulletListClock, contentDescription = null)
    }
}

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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.DocumentBulletListArrowLeft: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Regular.DocumentBulletListArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.75f, 11.5f)
                curveTo(10.408f, 11.5f, 10.12f, 11.728f, 10.03f, 12.041f)
                curveTo(10.453f, 12.315f, 10.842f, 12.637f, 11.19f, 13f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 13f, 17f, 12.664f, 17f, 12.25f)
                curveTo(17f, 11.836f, 16.664f, 11.5f, 16.25f, 11.5f)
                horizontalLineTo(10.75f)
                close()
                moveTo(5.5f, 4f)
                verticalLineTo(11.076f)
                curveTo(4.977f, 11.157f, 4.474f, 11.3f, 4f, 11.498f)
                verticalLineTo(4f)
                curveTo(4f, 2.896f, 4.896f, 2f, 6f, 2f)
                horizontalLineTo(12.172f)
                curveTo(12.2f, 2f, 12.227f, 2.004f, 12.254f, 2.007f)
                curveTo(12.274f, 2.01f, 12.293f, 2.013f, 12.313f, 2.014f)
                curveTo(12.528f, 2.029f, 12.74f, 2.07f, 12.937f, 2.152f)
                curveTo(12.994f, 2.176f, 13.049f, 2.208f, 13.103f, 2.239f)
                curveTo(13.12f, 2.249f, 13.136f, 2.259f, 13.153f, 2.268f)
                curveTo(13.168f, 2.276f, 13.184f, 2.284f, 13.2f, 2.292f)
                curveTo(13.228f, 2.305f, 13.256f, 2.319f, 13.281f, 2.336f)
                curveTo(13.359f, 2.389f, 13.429f, 2.452f, 13.5f, 2.516f)
                curveTo(13.512f, 2.526f, 13.524f, 2.536f, 13.536f, 2.545f)
                curveTo(13.553f, 2.558f, 13.57f, 2.571f, 13.585f, 2.586f)
                lineTo(19.414f, 8.414f)
                curveTo(19.789f, 8.789f, 20f, 9.298f, 20f, 9.828f)
                verticalLineTo(20f)
                curveTo(20f, 21.104f, 19.104f, 22f, 18f, 22f)
                horizontalLineTo(11.19f)
                curveTo(11.617f, 21.556f, 11.981f, 21.051f, 12.268f, 20.5f)
                horizontalLineTo(18f)
                curveTo(18.276f, 20.5f, 18.5f, 20.275f, 18.5f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                curveTo(12.896f, 10f, 12f, 9.104f, 12f, 8f)
                verticalLineTo(3.5f)
                horizontalLineTo(6f)
                curveTo(5.724f, 3.5f, 5.5f, 3.725f, 5.5f, 4f)
                close()
                moveTo(16.25f, 19f)
                horizontalLineTo(12.826f)
                curveTo(12.94f, 18.518f, 13f, 18.016f, 13f, 17.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 17.5f, 17f, 17.836f, 17f, 18.25f)
                curveTo(17f, 18.664f, 16.664f, 19f, 16.25f, 19f)
                close()
                moveTo(16.25f, 16f)
                horizontalLineTo(12.826f)
                curveTo(12.701f, 15.472f, 12.512f, 14.969f, 12.268f, 14.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 14.5f, 17f, 14.836f, 17f, 15.25f)
                curveTo(17f, 15.664f, 16.664f, 16f, 16.25f, 16f)
                close()
                moveTo(13.5f, 4.621f)
                verticalLineTo(8f)
                curveTo(13.5f, 8.275f, 13.724f, 8.5f, 14f, 8.5f)
                horizontalLineTo(17.378f)
                lineTo(13.5f, 4.621f)
                close()
                moveTo(6.5f, 23f)
                curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
                curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
                curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
                close()
                moveTo(9.5f, 18f)
                curveTo(9.776f, 18f, 10f, 17.776f, 10f, 17.5f)
                curveTo(10f, 17.224f, 9.776f, 17f, 9.5f, 17f)
                horizontalLineTo(4.707f)
                lineTo(6.354f, 15.354f)
                curveTo(6.549f, 15.158f, 6.549f, 14.842f, 6.354f, 14.646f)
                curveTo(6.158f, 14.451f, 5.842f, 14.451f, 5.646f, 14.646f)
                lineTo(3.146f, 17.146f)
                curveTo(2.951f, 17.342f, 2.951f, 17.658f, 3.146f, 17.854f)
                lineTo(5.646f, 20.354f)
                curveTo(5.842f, 20.549f, 6.158f, 20.549f, 6.354f, 20.354f)
                curveTo(6.549f, 20.158f, 6.549f, 19.842f, 6.354f, 19.646f)
                lineTo(4.707f, 18f)
                horizontalLineTo(9.5f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun DocumentBulletListArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentBulletListArrowLeft, contentDescription = null)
    }
}

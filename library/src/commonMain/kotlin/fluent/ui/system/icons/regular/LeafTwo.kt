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

public val FluentIcons.Regular.LeafTwo: ImageVector
    get() {
        if (_LeafTwo != null) {
            return _LeafTwo!!
        }
        _LeafTwo = ImageVector.Builder(
            name = "Regular.LeafTwo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.002f, 4.705f)
                verticalLineTo(9f)
                curveTo(2.002f, 12.314f, 4.689f, 15f, 8.002f, 15f)
                curveTo(8.1f, 15f, 8.198f, 14.998f, 8.295f, 14.993f)
                curveTo(8.557f, 15.877f, 8.99f, 16.687f, 9.554f, 17.387f)
                lineTo(7.224f, 19.716f)
                curveTo(6.931f, 20.008f, 6.931f, 20.483f, 7.223f, 20.776f)
                curveTo(7.516f, 21.069f, 7.991f, 21.069f, 8.284f, 20.777f)
                lineTo(10.615f, 18.447f)
                curveTo(11.815f, 19.415f, 13.342f, 19.995f, 15.004f, 19.995f)
                curveTo(18.87f, 19.995f, 22.003f, 16.861f, 22.003f, 12.996f)
                verticalLineTo(7.748f)
                curveTo(22.003f, 6.781f, 21.22f, 5.998f, 20.253f, 5.998f)
                lineTo(15.004f, 5.998f)
                curveTo(14.421f, 5.998f, 13.854f, 6.069f, 13.312f, 6.203f)
                curveTo(12.307f, 4.298f, 10.306f, 3f, 8.002f, 3f)
                horizontalLineTo(3.707f)
                curveTo(2.766f, 3f, 2.002f, 3.763f, 2.002f, 4.705f)
                close()
                moveTo(11.684f, 17.379f)
                lineTo(15.78f, 13.285f)
                curveTo(16.073f, 12.992f, 16.073f, 12.517f, 15.78f, 12.224f)
                curveTo(15.488f, 11.931f, 15.013f, 11.931f, 14.72f, 12.224f)
                lineTo(10.623f, 16.319f)
                curveTo(9.922f, 15.396f, 9.506f, 14.245f, 9.506f, 12.996f)
                curveTo(9.506f, 9.959f, 11.967f, 7.498f, 15.004f, 7.498f)
                horizontalLineTo(20.253f)
                curveTo(20.391f, 7.498f, 20.503f, 7.609f, 20.503f, 7.748f)
                verticalLineTo(12.996f)
                curveTo(20.503f, 16.033f, 18.041f, 18.495f, 15.004f, 18.495f)
                curveTo(13.757f, 18.495f, 12.606f, 18.079f, 11.684f, 17.379f)
                close()
                moveTo(8.002f, 4.5f)
                curveTo(9.659f, 4.5f, 11.106f, 5.395f, 11.888f, 6.728f)
                curveTo(10.789f, 7.275f, 9.855f, 8.103f, 9.178f, 9.117f)
                lineTo(7.28f, 7.22f)
                curveTo(6.987f, 6.927f, 6.513f, 6.927f, 6.22f, 7.22f)
                curveTo(5.927f, 7.513f, 5.927f, 7.987f, 6.22f, 8.28f)
                lineTo(8.457f, 10.518f)
                curveTo(8.165f, 11.288f, 8.006f, 12.124f, 8.006f, 12.996f)
                curveTo(8.006f, 13.166f, 8.012f, 13.334f, 8.024f, 13.5f)
                lineTo(8.002f, 13.5f)
                curveTo(5.517f, 13.5f, 3.502f, 11.485f, 3.502f, 9f)
                lineTo(3.502f, 4.705f)
                curveTo(3.502f, 4.592f, 3.594f, 4.5f, 3.707f, 4.5f)
                lineTo(8.002f, 4.5f)
                close()
            }
        }.build()

        return _LeafTwo!!
    }

@Suppress("ObjectPropertyName")
private var _LeafTwo: ImageVector? = null

@Preview
@Composable
private fun LeafTwoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LeafTwo, contentDescription = null)
    }
}

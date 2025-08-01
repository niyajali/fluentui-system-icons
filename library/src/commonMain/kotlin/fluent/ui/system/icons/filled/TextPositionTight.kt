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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.TextPositionTight: ImageVector
    get() {
        if (_TextPositionTight != null) {
            return _TextPositionTight!!
        }
        _TextPositionTight = ImageVector.Builder(
            name = "Filled.TextPositionTight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 3.75f)
                curveTo(3.198f, 3.75f, 2.75f, 4.198f, 2.75f, 4.75f)
                curveTo(2.75f, 5.302f, 3.198f, 5.75f, 3.75f, 5.75f)
                horizontalLineTo(20.25f)
                curveTo(20.802f, 5.75f, 21.25f, 5.302f, 21.25f, 4.75f)
                curveTo(21.25f, 4.198f, 20.802f, 3.75f, 20.25f, 3.75f)
                horizontalLineTo(3.75f)
                close()
                moveTo(15.874f, 9.25f)
                curveTo(15.487f, 8.395f, 14.826f, 7.691f, 14.002f, 7.25f)
                curveTo(13.405f, 6.931f, 12.724f, 6.75f, 12f, 6.75f)
                curveTo(11.276f, 6.75f, 10.595f, 6.931f, 9.998f, 7.25f)
                curveTo(9.174f, 7.691f, 8.513f, 8.395f, 8.126f, 9.25f)
                curveTo(7.917f, 9.712f, 7.788f, 10.218f, 7.757f, 10.75f)
                curveTo(7.752f, 10.833f, 7.75f, 10.916f, 7.75f, 11f)
                verticalLineTo(15.75f)
                curveTo(7.75f, 15.932f, 7.799f, 16.103f, 7.884f, 16.25f)
                curveTo(8.057f, 16.549f, 8.38f, 16.75f, 8.75f, 16.75f)
                curveTo(9.302f, 16.75f, 9.75f, 16.302f, 9.75f, 15.75f)
                verticalLineTo(11f)
                curveTo(9.75f, 10.978f, 9.75f, 10.956f, 9.751f, 10.934f)
                curveTo(9.753f, 10.872f, 9.757f, 10.811f, 9.764f, 10.75f)
                curveTo(9.831f, 10.146f, 10.137f, 9.613f, 10.586f, 9.25f)
                curveTo(10.972f, 8.937f, 11.464f, 8.75f, 12f, 8.75f)
                curveTo(12.536f, 8.75f, 13.028f, 8.937f, 13.414f, 9.25f)
                curveTo(13.863f, 9.613f, 14.169f, 10.146f, 14.236f, 10.75f)
                curveTo(14.243f, 10.811f, 14.247f, 10.872f, 14.249f, 10.934f)
                curveTo(14.25f, 10.956f, 14.25f, 10.978f, 14.25f, 11f)
                verticalLineTo(15.75f)
                curveTo(14.25f, 16.302f, 14.698f, 16.75f, 15.25f, 16.75f)
                curveTo(15.62f, 16.75f, 15.943f, 16.549f, 16.116f, 16.25f)
                curveTo(16.201f, 16.103f, 16.25f, 15.932f, 16.25f, 15.75f)
                verticalLineTo(11f)
                curveTo(16.25f, 10.916f, 16.248f, 10.833f, 16.243f, 10.75f)
                curveTo(16.212f, 10.218f, 16.083f, 9.712f, 15.874f, 9.25f)
                close()
                moveTo(3.75f, 7.25f)
                horizontalLineTo(8.326f)
                curveTo(7.76f, 7.805f, 7.318f, 8.487f, 7.049f, 9.25f)
                horizontalLineTo(3.75f)
                curveTo(3.198f, 9.25f, 2.75f, 8.802f, 2.75f, 8.25f)
                curveTo(2.75f, 7.698f, 3.198f, 7.25f, 3.75f, 7.25f)
                close()
                moveTo(3.75f, 10.75f)
                horizontalLineTo(6.756f)
                curveTo(6.752f, 10.833f, 6.75f, 10.916f, 6.75f, 11f)
                verticalLineTo(12.75f)
                horizontalLineTo(3.75f)
                curveTo(3.198f, 12.75f, 2.75f, 12.302f, 2.75f, 11.75f)
                curveTo(2.75f, 11.198f, 3.198f, 10.75f, 3.75f, 10.75f)
                close()
                moveTo(3.75f, 14.25f)
                horizontalLineTo(6.75f)
                verticalLineTo(15.75f)
                curveTo(6.75f, 15.923f, 6.772f, 16.09f, 6.813f, 16.25f)
                horizontalLineTo(3.75f)
                curveTo(3.198f, 16.25f, 2.75f, 15.802f, 2.75f, 15.25f)
                curveTo(2.75f, 14.698f, 3.198f, 14.25f, 3.75f, 14.25f)
                close()
                moveTo(17.25f, 15.75f)
                curveTo(17.25f, 15.923f, 17.228f, 16.09f, 17.187f, 16.25f)
                horizontalLineTo(20.25f)
                curveTo(20.802f, 16.25f, 21.25f, 15.802f, 21.25f, 15.25f)
                curveTo(21.25f, 14.698f, 20.802f, 14.25f, 20.25f, 14.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(15.75f)
                close()
                moveTo(20.25f, 12.75f)
                horizontalLineTo(17.25f)
                verticalLineTo(11f)
                curveTo(17.25f, 10.916f, 17.248f, 10.833f, 17.244f, 10.75f)
                horizontalLineTo(20.25f)
                curveTo(20.802f, 10.75f, 21.25f, 11.198f, 21.25f, 11.75f)
                curveTo(21.25f, 12.302f, 20.802f, 12.75f, 20.25f, 12.75f)
                close()
                moveTo(20.25f, 9.25f)
                horizontalLineTo(16.951f)
                curveTo(16.682f, 8.487f, 16.24f, 7.805f, 15.674f, 7.25f)
                horizontalLineTo(20.25f)
                curveTo(20.802f, 7.25f, 21.25f, 7.698f, 21.25f, 8.25f)
                curveTo(21.25f, 8.802f, 20.802f, 9.25f, 20.25f, 9.25f)
                close()
                moveTo(3.75f, 17.75f)
                horizontalLineTo(20.25f)
                curveTo(20.802f, 17.75f, 21.25f, 18.198f, 21.25f, 18.75f)
                curveTo(21.25f, 19.302f, 20.802f, 19.75f, 20.25f, 19.75f)
                horizontalLineTo(3.75f)
                curveTo(3.198f, 19.75f, 2.75f, 19.302f, 2.75f, 18.75f)
                curveTo(2.75f, 18.198f, 3.198f, 17.75f, 3.75f, 17.75f)
                close()
            }
        }.build()

        return _TextPositionTight!!
    }

@Suppress("ObjectPropertyName")
private var _TextPositionTight: ImageVector? = null

@Preview
@Composable
private fun TextPositionTightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextPositionTight, contentDescription = null)
    }
}

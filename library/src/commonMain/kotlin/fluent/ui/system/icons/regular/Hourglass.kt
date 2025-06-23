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

public val FluentIcons.Regular.Hourglass: ImageVector
    get() {
        if (_Hourglass != null) {
            return _Hourglass!!
        }
        _Hourglass = ImageVector.Builder(
            name = "Regular.Hourglass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 4.75f)
                curveTo(4f, 3.231f, 5.231f, 2f, 6.75f, 2f)
                horizontalLineTo(17.25f)
                curveTo(18.769f, 2f, 20f, 3.231f, 20f, 4.75f)
                verticalLineTo(5.169f)
                curveTo(20f, 7.189f, 18.94f, 9.06f, 17.208f, 10.1f)
                lineTo(15.398f, 11.186f)
                curveTo(14.928f, 11.468f, 14.909f, 12.141f, 15.362f, 12.449f)
                lineTo(17.483f, 13.892f)
                curveTo(19.058f, 14.962f, 20f, 16.743f, 20f, 18.646f)
                verticalLineTo(19.25f)
                curveTo(20f, 20.769f, 18.769f, 22f, 17.25f, 22f)
                horizontalLineTo(6.75f)
                curveTo(5.231f, 22f, 4f, 20.769f, 4f, 19.25f)
                verticalLineTo(18.646f)
                curveTo(4f, 16.743f, 4.942f, 14.962f, 6.517f, 13.892f)
                lineTo(8.638f, 12.449f)
                curveTo(9.091f, 12.141f, 9.072f, 11.468f, 8.602f, 11.186f)
                lineTo(6.792f, 10.1f)
                curveTo(5.06f, 9.06f, 4f, 7.189f, 4f, 5.169f)
                verticalLineTo(4.75f)
                close()
                moveTo(6.75f, 3.5f)
                curveTo(6.06f, 3.5f, 5.5f, 4.06f, 5.5f, 4.75f)
                verticalLineTo(5.169f)
                curveTo(5.5f, 6.662f, 6.283f, 8.045f, 7.563f, 8.813f)
                lineTo(9.374f, 9.9f)
                curveTo(10.783f, 10.745f, 10.84f, 12.766f, 9.481f, 13.69f)
                lineTo(7.36f, 15.132f)
                curveTo(6.197f, 15.923f, 5.5f, 17.239f, 5.5f, 18.646f)
                verticalLineTo(19.25f)
                curveTo(5.5f, 19.94f, 6.06f, 20.5f, 6.75f, 20.5f)
                horizontalLineTo(17.25f)
                curveTo(17.94f, 20.5f, 18.5f, 19.94f, 18.5f, 19.25f)
                verticalLineTo(18.646f)
                curveTo(18.5f, 17.239f, 17.803f, 15.923f, 16.64f, 15.132f)
                lineTo(14.519f, 13.69f)
                curveTo(13.16f, 12.766f, 13.217f, 10.745f, 14.626f, 9.9f)
                lineTo(16.437f, 8.813f)
                curveTo(17.717f, 8.045f, 18.5f, 6.662f, 18.5f, 5.169f)
                verticalLineTo(4.75f)
                curveTo(18.5f, 4.06f, 17.94f, 3.5f, 17.25f, 3.5f)
                horizontalLineTo(6.75f)
                close()
            }
        }.build()

        return _Hourglass!!
    }

@Suppress("ObjectPropertyName")
private var _Hourglass: ImageVector? = null

@Preview
@Composable
private fun HourglassPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Hourglass, contentDescription = null)
    }
}

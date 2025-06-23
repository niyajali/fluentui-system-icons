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

public val FluentIcons.Regular.Guest: ImageVector
    get() {
        if (_Guest != null) {
            return _Guest!!
        }
        _Guest = ImageVector.Builder(
            name = "Regular.Guest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16f, 15.245f)
                curveTo(16f, 14.555f, 15.44f, 13.995f, 14.75f, 13.995f)
                horizontalLineTo(9.25f)
                curveTo(8.56f, 13.995f, 8f, 14.555f, 8f, 15.245f)
                verticalLineTo(15.743f)
                curveTo(8f, 17.59f, 9.472f, 18.499f, 12f, 18.499f)
                curveTo(14.528f, 18.499f, 16f, 17.591f, 16f, 15.745f)
                verticalLineTo(15.245f)
                close()
                moveTo(9.5f, 15.743f)
                verticalLineTo(15.495f)
                horizontalLineTo(14.5f)
                verticalLineTo(15.745f)
                curveTo(14.5f, 16.571f, 13.805f, 16.999f, 12f, 16.999f)
                curveTo(10.195f, 16.999f, 9.5f, 16.57f, 9.5f, 15.743f)
                close()
                moveTo(14.5f, 10.495f)
                curveTo(14.5f, 9.115f, 13.381f, 7.996f, 12f, 7.996f)
                curveTo(10.619f, 7.996f, 9.5f, 9.115f, 9.5f, 10.495f)
                curveTo(9.5f, 11.876f, 10.619f, 12.995f, 12f, 12.995f)
                curveTo(13.381f, 12.995f, 14.5f, 11.876f, 14.5f, 10.495f)
                close()
                moveTo(11f, 10.495f)
                curveTo(11f, 9.943f, 11.448f, 9.496f, 12f, 9.496f)
                curveTo(12.552f, 9.496f, 13f, 9.943f, 13f, 10.495f)
                curveTo(13f, 11.048f, 12.552f, 11.495f, 12f, 11.495f)
                curveTo(11.448f, 11.495f, 11f, 11.048f, 11f, 10.495f)
                close()
                moveTo(10.75f, 5f)
                curveTo(10.336f, 5f, 10f, 5.336f, 10f, 5.75f)
                curveTo(10f, 6.164f, 10.336f, 6.5f, 10.75f, 6.5f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 6.5f, 14f, 6.164f, 14f, 5.75f)
                curveTo(14f, 5.336f, 13.664f, 5f, 13.25f, 5f)
                horizontalLineTo(10.75f)
                close()
                moveTo(19.995f, 4.096f)
                curveTo(19.916f, 2.925f, 18.941f, 2f, 17.75f, 2f)
                horizontalLineTo(6.25f)
                lineTo(6.096f, 2.005f)
                curveTo(4.925f, 2.084f, 4f, 3.059f, 4f, 4.25f)
                verticalLineTo(19.755f)
                lineTo(4.005f, 19.909f)
                curveTo(4.084f, 21.079f, 5.059f, 22.005f, 6.25f, 22.005f)
                horizontalLineTo(17.75f)
                lineTo(17.904f, 21.999f)
                curveTo(19.075f, 21.92f, 20f, 20.945f, 20f, 19.755f)
                verticalLineTo(4.25f)
                lineTo(19.995f, 4.096f)
                close()
                moveTo(6.25f, 3.5f)
                horizontalLineTo(17.75f)
                lineTo(17.852f, 3.507f)
                curveTo(18.218f, 3.557f, 18.5f, 3.87f, 18.5f, 4.25f)
                verticalLineTo(19.755f)
                lineTo(18.493f, 19.856f)
                curveTo(18.444f, 20.222f, 18.13f, 20.505f, 17.75f, 20.505f)
                horizontalLineTo(6.25f)
                lineTo(6.148f, 20.498f)
                curveTo(5.782f, 20.448f, 5.5f, 20.134f, 5.5f, 19.755f)
                verticalLineTo(4.25f)
                lineTo(5.507f, 4.148f)
                curveTo(5.557f, 3.782f, 5.87f, 3.5f, 6.25f, 3.5f)
                close()
            }
        }.build()

        return _Guest!!
    }

@Suppress("ObjectPropertyName")
private var _Guest: ImageVector? = null

@Preview
@Composable
private fun GuestPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Guest, contentDescription = null)
    }
}

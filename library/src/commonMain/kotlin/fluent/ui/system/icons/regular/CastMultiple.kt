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

public val FluentIcons.Regular.CastMultiple: ImageVector
    get() {
        if (_CastMultiple != null) {
            return _CastMultiple!!
        }
        _CastMultiple = ImageVector.Builder(
            name = "Regular.CastMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.25f, 3f)
                curveTo(6.455f, 3f, 5f, 4.455f, 5f, 6.25f)
                verticalLineTo(10.009f)
                curveTo(3.322f, 10.137f, 2f, 11.539f, 2f, 13.25f)
                verticalLineTo(17.75f)
                curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
                horizontalLineTo(10.25f)
                curveTo(11.961f, 21f, 13.363f, 19.678f, 13.491f, 18f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 18f, 22f, 16.545f, 22f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(22f, 4.455f, 20.545f, 3f, 18.75f, 3f)
                horizontalLineTo(8.25f)
                close()
                moveTo(5.25f, 11.5f)
                horizontalLineTo(7.25f)
                curveTo(7.664f, 11.5f, 8f, 11.164f, 8f, 10.75f)
                curveTo(8f, 10.336f, 7.664f, 10f, 7.25f, 10f)
                horizontalLineTo(6.5f)
                verticalLineTo(6.25f)
                curveTo(6.5f, 5.284f, 7.284f, 4.5f, 8.25f, 4.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 4.5f, 20.5f, 5.284f, 20.5f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(20.5f, 15.717f, 19.716f, 16.5f, 18.75f, 16.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(15.75f)
                curveTo(13.5f, 15.336f, 13.164f, 15f, 12.75f, 15f)
                curveTo(12.336f, 15f, 12f, 15.336f, 12f, 15.75f)
                verticalLineTo(17.75f)
                curveTo(12f, 18.716f, 11.217f, 19.5f, 10.25f, 19.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 19.5f, 3.5f, 18.716f, 3.5f, 17.75f)
                verticalLineTo(13.25f)
                curveTo(3.5f, 12.283f, 4.284f, 11.5f, 5.25f, 11.5f)
                close()
                moveTo(10.502f, 14f)
                curveTo(11.053f, 14f, 11.5f, 13.553f, 11.5f, 13.002f)
                curveTo(11.5f, 12.45f, 11.053f, 12.004f, 10.502f, 12.004f)
                curveTo(9.951f, 12.004f, 9.504f, 12.45f, 9.504f, 13.002f)
                curveTo(9.504f, 13.553f, 9.951f, 14f, 10.502f, 14f)
                close()
                moveTo(10.25f, 9.007f)
                curveTo(9.836f, 9.007f, 9.5f, 9.343f, 9.5f, 9.757f)
                curveTo(9.5f, 10.171f, 9.836f, 10.507f, 10.25f, 10.507f)
                curveTo(11.767f, 10.507f, 12.997f, 11.737f, 12.997f, 13.254f)
                curveTo(12.997f, 13.668f, 13.333f, 14.004f, 13.747f, 14.004f)
                curveTo(14.161f, 14.004f, 14.497f, 13.668f, 14.497f, 13.254f)
                curveTo(14.497f, 10.908f, 12.596f, 9.007f, 10.25f, 9.007f)
                close()
                moveTo(10.25f, 6f)
                curveTo(9.836f, 6f, 9.5f, 6.336f, 9.5f, 6.75f)
                curveTo(9.5f, 7.164f, 9.836f, 7.5f, 10.25f, 7.5f)
                curveTo(13.428f, 7.5f, 16.004f, 10.076f, 16.004f, 13.254f)
                curveTo(16.004f, 13.668f, 16.34f, 14.004f, 16.754f, 14.004f)
                curveTo(17.168f, 14.004f, 17.504f, 13.668f, 17.504f, 13.254f)
                curveTo(17.504f, 9.248f, 14.256f, 6f, 10.25f, 6f)
                close()
            }
        }.build()

        return _CastMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CastMultiple: ImageVector? = null

@Preview
@Composable
private fun CastMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CastMultiple, contentDescription = null)
    }
}

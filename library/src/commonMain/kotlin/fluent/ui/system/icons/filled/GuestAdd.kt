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

public val FluentIcons.Filled.GuestAdd: ImageVector
    get() {
        if (_GuestAdd != null) {
            return _GuestAdd!!
        }
        _GuestAdd = ImageVector.Builder(
            name = "Filled.GuestAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 2f)
                curveTo(5.007f, 2f, 4f, 3.007f, 4f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
                horizontalLineTo(12.81f)
                curveTo(11.78f, 20.927f, 11.115f, 19.501f, 11.013f, 17.921f)
                curveTo(10.301f, 17.802f, 9.67f, 17.548f, 9.165f, 17.154f)
                curveTo(8.418f, 16.574f, 8f, 15.73f, 8f, 14.75f)
                curveTo(8f, 13.783f, 8.783f, 13f, 9.75f, 13f)
                horizontalLineTo(12.81f)
                curveTo(13.993f, 11.767f, 15.657f, 11f, 17.5f, 11f)
                curveTo(18.386f, 11f, 19.23f, 11.177f, 20f, 11.498f)
                verticalLineTo(4.25f)
                curveTo(20f, 3.007f, 18.993f, 2f, 17.75f, 2f)
                horizontalLineTo(6.25f)
                close()
                moveTo(12f, 6.5f)
                curveTo(13.381f, 6.5f, 14.5f, 7.619f, 14.5f, 9f)
                curveTo(14.5f, 10.381f, 13.381f, 11.5f, 12f, 11.5f)
                curveTo(10.619f, 11.5f, 9.5f, 10.381f, 9.5f, 9f)
                curveTo(9.5f, 7.619f, 10.619f, 6.5f, 12f, 6.5f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
                curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
                curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(18.001f, 18f)
                lineTo(18.001f, 20.503f)
                curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
                curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
                lineTo(17.001f, 18f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
                curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
                horizontalLineTo(17f)
                lineTo(17f, 14.499f)
                curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
                curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
                lineTo(18f, 17f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
                curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
                horizontalLineTo(18.001f)
                close()
            }
        }.build()

        return _GuestAdd!!
    }

@Suppress("ObjectPropertyName")
private var _GuestAdd: ImageVector? = null

@Preview
@Composable
private fun GuestAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GuestAdd, contentDescription = null)
    }
}

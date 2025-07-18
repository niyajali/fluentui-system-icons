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

public val FluentIcons.Regular.BreakoutRoom: ImageVector
    get() {
        if (_BreakoutRoom != null) {
            return _BreakoutRoom!!
        }
        _BreakoutRoom = ImageVector.Builder(
            name = "Regular.BreakoutRoom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(14.214f)
                curveTo(14.62f, 20.568f, 14.945f, 20.06f, 15.167f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(8.833f)
                curveTo(3.94f, 9.055f, 3.432f, 9.38f, 3f, 9.786f)
                verticalLineTo(6.25f)
                close()
                moveTo(13.489f, 19.5f)
                curveTo(12.912f, 20.402f, 11.901f, 21f, 10.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(13.25f)
                curveTo(3f, 12.099f, 3.598f, 11.088f, 4.5f, 10.511f)
                curveTo(5.005f, 10.188f, 5.606f, 10f, 6.25f, 10f)
                horizontalLineTo(10.75f)
                curveTo(12.545f, 10f, 14f, 11.455f, 14f, 13.25f)
                verticalLineTo(17.75f)
                curveTo(14f, 18.394f, 13.813f, 18.995f, 13.489f, 19.5f)
                close()
                moveTo(4.5f, 13.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(10.75f)
                curveTo(11.717f, 19.5f, 12.5f, 18.716f, 12.5f, 17.75f)
                verticalLineTo(13.25f)
                curveTo(12.5f, 12.283f, 11.717f, 11.5f, 10.75f, 11.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 11.5f, 4.5f, 12.283f, 4.5f, 13.25f)
                close()
            }
        }.build()

        return _BreakoutRoom!!
    }

@Suppress("ObjectPropertyName")
private var _BreakoutRoom: ImageVector? = null

@Preview
@Composable
private fun BreakoutRoomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BreakoutRoom, contentDescription = null)
    }
}

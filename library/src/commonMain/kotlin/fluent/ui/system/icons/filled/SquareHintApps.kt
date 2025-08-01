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

public val FluentIcons.Filled.SquareHintApps: ImageVector
    get() {
        if (_SquareHintApps != null) {
            return _SquareHintApps!!
        }
        _SquareHintApps = ImageVector.Builder(
            name = "Filled.SquareHintApps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(6.664f, 3f, 7f, 3.336f, 7f, 3.75f)
                curveTo(7f, 4.164f, 6.664f, 4.5f, 6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                curveTo(4.5f, 6.664f, 4.164f, 7f, 3.75f, 7f)
                curveTo(3.336f, 7f, 3f, 6.664f, 3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                close()
                moveTo(9.75f, 3f)
                curveTo(9.336f, 3f, 9f, 3.336f, 9f, 3.75f)
                curveTo(9f, 4.164f, 9.336f, 4.5f, 9.75f, 4.5f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 4.5f, 15f, 4.164f, 15f, 3.75f)
                curveTo(15f, 3.336f, 14.664f, 3f, 14.25f, 3f)
                horizontalLineTo(9.75f)
                close()
                moveTo(17f, 3.75f)
                curveTo(17f, 4.164f, 17.336f, 4.5f, 17.75f, 4.5f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(7.25f)
                curveTo(19.5f, 7.664f, 19.836f, 8f, 20.25f, 8f)
                curveTo(20.664f, 8f, 21f, 7.664f, 21f, 7.25f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                curveTo(17.336f, 3f, 17f, 3.336f, 17f, 3.75f)
                close()
                moveTo(3f, 17.75f)
                curveTo(3f, 17.336f, 3.336f, 17f, 3.75f, 17f)
                curveTo(4.164f, 17f, 4.5f, 17.336f, 4.5f, 17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(7.25f)
                curveTo(7.664f, 19.5f, 8f, 19.836f, 8f, 20.25f)
                curveTo(8f, 20.664f, 7.664f, 21f, 7.25f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                close()
                moveTo(3f, 14.25f)
                curveTo(3f, 14.664f, 3.336f, 15f, 3.75f, 15f)
                curveTo(4.164f, 15f, 4.5f, 14.664f, 4.5f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(4.5f, 9.336f, 4.164f, 9f, 3.75f, 9f)
                curveTo(3.336f, 9f, 3f, 9.336f, 3f, 9.75f)
                verticalLineTo(14.25f)
                close()
                moveTo(7f, 5.5f)
                curveTo(6.172f, 5.5f, 5.5f, 6.172f, 5.5f, 7f)
                verticalLineTo(17f)
                curveTo(5.5f, 17.828f, 6.172f, 18.5f, 7f, 18.5f)
                horizontalLineTo(9f)
                verticalLineTo(17.75f)
                curveTo(9f, 15.955f, 10.455f, 14.5f, 12.25f, 14.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(12.25f)
                curveTo(14.5f, 10.455f, 15.955f, 9f, 17.75f, 9f)
                horizontalLineTo(18.5f)
                verticalLineTo(7f)
                curveTo(18.5f, 6.172f, 17.828f, 5.5f, 17f, 5.5f)
                horizontalLineTo(7f)
                close()
                moveTo(12.25f, 15.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(12.25f)
                curveTo(15.5f, 11.007f, 16.507f, 10f, 17.75f, 10f)
                horizontalLineTo(20.75f)
                curveTo(21.993f, 10f, 23f, 11.007f, 23f, 12.25f)
                verticalLineTo(19.75f)
                curveTo(23f, 21.545f, 21.545f, 23f, 19.75f, 23f)
                horizontalLineTo(12.25f)
                curveTo(11.007f, 23f, 10f, 21.993f, 10f, 20.75f)
                verticalLineTo(17.75f)
                curveTo(10f, 16.507f, 11.007f, 15.5f, 12.25f, 15.5f)
                close()
                moveTo(17f, 12.25f)
                verticalLineTo(15.5f)
                horizontalLineTo(21.5f)
                verticalLineTo(12.25f)
                curveTo(21.5f, 11.836f, 21.164f, 11.5f, 20.75f, 11.5f)
                horizontalLineTo(17.75f)
                curveTo(17.336f, 11.5f, 17f, 11.836f, 17f, 12.25f)
                close()
                moveTo(15.5f, 21.5f)
                verticalLineTo(17f)
                horizontalLineTo(12.25f)
                curveTo(11.836f, 17f, 11.5f, 17.336f, 11.5f, 17.75f)
                verticalLineTo(20.75f)
                curveTo(11.5f, 21.164f, 11.836f, 21.5f, 12.25f, 21.5f)
                horizontalLineTo(15.5f)
                close()
                moveTo(17f, 17f)
                verticalLineTo(21.5f)
                horizontalLineTo(19.75f)
                curveTo(20.716f, 21.5f, 21.5f, 20.716f, 21.5f, 19.75f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _SquareHintApps!!
    }

@Suppress("ObjectPropertyName")
private var _SquareHintApps: ImageVector? = null

@Preview
@Composable
private fun SquareHintAppsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SquareHintApps, contentDescription = null)
    }
}

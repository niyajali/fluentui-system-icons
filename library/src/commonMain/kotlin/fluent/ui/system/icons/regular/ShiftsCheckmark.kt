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

public val FluentIcons.Regular.ShiftsCheckmark: ImageVector
    get() {
        if (_ShiftsCheckmark != null) {
            return _ShiftsCheckmark!!
        }
        _ShiftsCheckmark = ImageVector.Builder(
            name = "Regular.ShiftsCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(12.686f)
                curveTo(12.514f, 20.034f, 12.275f, 20.537f, 11.978f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(12.022f)
                curveTo(3.463f, 11.725f, 3.967f, 11.486f, 4.5f, 11.314f)
                verticalLineTo(6.25f)
                close()
                moveTo(12.5f, 6.75f)
                curveTo(12.5f, 6.336f, 12.164f, 6f, 11.75f, 6f)
                curveTo(11.336f, 6f, 11f, 6.336f, 11f, 6.75f)
                verticalLineTo(12.75f)
                curveTo(11f, 13.164f, 11.336f, 13.5f, 11.75f, 13.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 13.5f, 17f, 13.164f, 17f, 12.75f)
                curveTo(17f, 12.336f, 16.664f, 12f, 16.25f, 12f)
                horizontalLineTo(12.5f)
                verticalLineTo(6.75f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
                curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
                curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
                curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
                close()
                moveTo(8.854f, 15.646f)
                curveTo(8.658f, 15.451f, 8.342f, 15.451f, 8.146f, 15.646f)
                lineTo(5.5f, 18.293f)
                lineTo(4.604f, 17.396f)
                curveTo(4.408f, 17.201f, 4.092f, 17.201f, 3.896f, 17.396f)
                curveTo(3.701f, 17.592f, 3.701f, 17.908f, 3.896f, 18.104f)
                lineTo(5.146f, 19.354f)
                curveTo(5.342f, 19.549f, 5.658f, 19.549f, 5.854f, 19.354f)
                lineTo(8.854f, 16.354f)
                curveTo(9.049f, 16.158f, 9.049f, 15.842f, 8.854f, 15.646f)
                close()
            }
        }.build()

        return _ShiftsCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _ShiftsCheckmark: ImageVector? = null

@Preview
@Composable
private fun ShiftsCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShiftsCheckmark, contentDescription = null)
    }
}

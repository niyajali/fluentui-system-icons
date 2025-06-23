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

public val FluentIcons.Regular.DocumentTextClock: ImageVector
    get() {
        if (_DocumentTextClock != null) {
            return _DocumentTextClock!!
        }
        _DocumentTextClock = ImageVector.Builder(
            name = "Regular.DocumentTextClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 2f)
                curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
                verticalLineTo(11.498f)
                curveTo(4.474f, 11.3f, 4.977f, 11.157f, 5.5f, 11.076f)
                verticalLineTo(4f)
                curveTo(5.5f, 3.724f, 5.724f, 3.5f, 6f, 3.5f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(18.5f)
                verticalLineTo(20f)
                curveTo(18.5f, 20.276f, 18.276f, 20.5f, 18f, 20.5f)
                horizontalLineTo(12.268f)
                curveTo(11.981f, 21.051f, 11.617f, 21.556f, 11.19f, 22f)
                horizontalLineTo(18f)
                curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
                verticalLineTo(9.828f)
                curveTo(20f, 9.297f, 19.789f, 8.789f, 19.414f, 8.414f)
                lineTo(13.586f, 2.586f)
                curveTo(13.211f, 2.211f, 12.703f, 2f, 12.172f, 2f)
                horizontalLineTo(6f)
                close()
                moveTo(17.379f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
                verticalLineTo(4.621f)
                lineTo(17.379f, 8.5f)
                close()
                moveTo(11.19f, 13f)
                curveTo(10.577f, 12.361f, 9.834f, 11.847f, 9.004f, 11.5f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 11.5f, 16f, 11.836f, 16f, 12.25f)
                curveTo(16f, 12.664f, 15.664f, 13f, 15.25f, 13f)
                horizontalLineTo(11.19f)
                close()
                moveTo(12.13f, 14.25f)
                curveTo(12.4f, 14.717f, 12.614f, 15.22f, 12.762f, 15.75f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 15.75f, 16f, 15.414f, 16f, 15f)
                curveTo(16f, 14.586f, 15.664f, 14.25f, 15.25f, 14.25f)
                horizontalLineTo(12.13f)
                close()
                moveTo(13f, 17.5f)
                curveTo(13f, 17.84f, 12.974f, 18.174f, 12.924f, 18.5f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 18.5f, 16f, 18.164f, 16f, 17.75f)
                curveTo(16f, 17.336f, 15.664f, 17f, 15.25f, 17f)
                horizontalLineTo(12.981f)
                curveTo(12.994f, 17.165f, 13f, 17.332f, 13f, 17.5f)
                close()
                moveTo(6.5f, 12f)
                curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
                curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
                curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
                close()
                moveTo(7f, 14.5f)
                curveTo(7f, 14.224f, 6.776f, 14f, 6.5f, 14f)
                curveTo(6.224f, 14f, 6f, 14.224f, 6f, 14.5f)
                verticalLineTo(17.5f)
                curveTo(6f, 17.776f, 6.224f, 18f, 6.5f, 18f)
                horizontalLineTo(9f)
                curveTo(9.276f, 18f, 9.5f, 17.776f, 9.5f, 17.5f)
                curveTo(9.5f, 17.224f, 9.276f, 17f, 9f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _DocumentTextClock!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentTextClock: ImageVector? = null

@Preview
@Composable
private fun DocumentTextClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentTextClock, contentDescription = null)
    }
}

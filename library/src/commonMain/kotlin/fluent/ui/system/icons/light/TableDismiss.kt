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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.TableDismiss: ImageVector
    get() {
        if (_TableDismiss != null) {
            return _TableDismiss!!
        }
        _TableDismiss = ImageVector.Builder(
            name = "Light.TableDismiss",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 7.5f)
                curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
                horizontalLineTo(24.5f)
                curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
                verticalLineTo(16.375f)
                curveTo(28.683f, 16.13f, 28.349f, 15.906f, 28f, 15.704f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                verticalLineTo(14.852f)
                curveTo(20.658f, 14.95f, 20.324f, 15.069f, 20f, 15.206f)
                verticalLineTo(12f)
                lineTo(12f, 12f)
                verticalLineTo(20f)
                horizontalLineTo(15.206f)
                curveTo(15.069f, 20.324f, 14.95f, 20.658f, 14.852f, 21f)
                horizontalLineTo(12f)
                verticalLineTo(28f)
                horizontalLineTo(15.704f)
                curveTo(15.906f, 28.349f, 16.13f, 28.683f, 16.375f, 29f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(4f, 21f)
                verticalLineTo(24.5f)
                curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                close()
                moveTo(4f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                close()
                moveTo(7.5f, 4f)
                curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(7.5f)
                close()
                moveTo(20f, 4f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                lineTo(20f, 11f)
                verticalLineTo(4f)
                close()
                moveTo(21f, 4f)
                verticalLineTo(11f)
                lineTo(28f, 11f)
                verticalLineTo(7.5f)
                curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
                horizontalLineTo(21f)
                close()
                moveTo(23.5f, 16f)
                curveTo(27.642f, 16f, 31f, 19.358f, 31f, 23.5f)
                curveTo(31f, 27.642f, 27.642f, 31f, 23.5f, 31f)
                curveTo(19.358f, 31f, 16f, 27.642f, 16f, 23.5f)
                curveTo(16f, 19.358f, 19.358f, 16f, 23.5f, 16f)
                close()
                moveTo(26.22f, 19.72f)
                lineTo(23.5f, 22.439f)
                lineTo(20.78f, 19.72f)
                curveTo(20.487f, 19.427f, 20.013f, 19.427f, 19.72f, 19.72f)
                curveTo(19.427f, 20.013f, 19.427f, 20.487f, 19.72f, 20.78f)
                lineTo(22.439f, 23.5f)
                lineTo(19.72f, 26.22f)
                curveTo(19.427f, 26.513f, 19.427f, 26.987f, 19.72f, 27.28f)
                curveTo(20.013f, 27.573f, 20.487f, 27.573f, 20.78f, 27.28f)
                lineTo(23.5f, 24.561f)
                lineTo(26.22f, 27.28f)
                curveTo(26.513f, 27.573f, 26.987f, 27.573f, 27.28f, 27.28f)
                curveTo(27.573f, 26.987f, 27.573f, 26.513f, 27.28f, 26.22f)
                lineTo(24.561f, 23.5f)
                lineTo(27.28f, 20.78f)
                curveTo(27.573f, 20.487f, 27.573f, 20.013f, 27.28f, 19.72f)
                curveTo(26.987f, 19.427f, 26.513f, 19.427f, 26.22f, 19.72f)
                close()
            }
        }.build()

        return _TableDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _TableDismiss: ImageVector? = null

@Preview
@Composable
private fun TableDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.TableDismiss, contentDescription = null)
    }
}

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

public val FluentIcons.Regular.Syringe: ImageVector
    get() {
        if (_Syringe != null) {
            return _Syringe!!
        }
        _Syringe = ImageVector.Builder(
            name = "Regular.Syringe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.725f, 2.22f)
                curveTo(17.017f, 1.927f, 17.492f, 1.927f, 17.785f, 2.22f)
                lineTo(21.785f, 6.22f)
                curveTo(22.078f, 6.513f, 22.078f, 6.987f, 21.785f, 7.28f)
                curveTo(21.492f, 7.573f, 21.017f, 7.573f, 20.725f, 7.28f)
                lineTo(20.254f, 6.81f)
                lineTo(18.561f, 8.5f)
                lineTo(21.03f, 10.97f)
                curveTo(21.323f, 11.263f, 21.323f, 11.737f, 21.03f, 12.03f)
                curveTo(20.737f, 12.323f, 20.263f, 12.323f, 19.97f, 12.03f)
                lineTo(18.5f, 10.561f)
                lineTo(11.659f, 17.402f)
                curveTo(10.956f, 18.105f, 10.002f, 18.5f, 9.007f, 18.5f)
                horizontalLineTo(6.561f)
                lineTo(3.28f, 21.78f)
                curveTo(2.987f, 22.073f, 2.513f, 22.073f, 2.22f, 21.78f)
                curveTo(1.927f, 21.487f, 1.927f, 21.013f, 2.22f, 20.72f)
                lineTo(5.5f, 17.439f)
                verticalLineTo(14.993f)
                curveTo(5.5f, 13.998f, 5.895f, 13.044f, 6.598f, 12.341f)
                lineTo(7.469f, 11.47f)
                curveTo(7.469f, 11.47f, 7.469f, 11.47f, 7.469f, 11.47f)
                curveTo(7.469f, 11.47f, 7.47f, 11.469f, 7.47f, 11.469f)
                lineTo(9.469f, 9.47f)
                curveTo(9.469f, 9.47f, 9.469f, 9.47f, 9.469f, 9.47f)
                curveTo(9.469f, 9.47f, 9.47f, 9.469f, 9.47f, 9.469f)
                lineTo(11.469f, 7.47f)
                curveTo(11.469f, 7.47f, 11.469f, 7.47f, 11.47f, 7.47f)
                curveTo(11.47f, 7.469f, 11.47f, 7.469f, 11.47f, 7.469f)
                lineTo(13.439f, 5.5f)
                lineTo(11.97f, 4.03f)
                curveTo(11.677f, 3.737f, 11.677f, 3.263f, 11.97f, 2.97f)
                curveTo(12.263f, 2.677f, 12.737f, 2.677f, 13.03f, 2.97f)
                lineTo(15.5f, 5.439f)
                lineTo(17.194f, 3.749f)
                lineTo(16.725f, 3.28f)
                curveTo(16.432f, 2.987f, 16.432f, 2.513f, 16.725f, 2.22f)
                close()
                moveTo(12f, 9.061f)
                lineTo(11.061f, 10f)
                lineTo(11.78f, 10.72f)
                curveTo(12.073f, 11.013f, 12.073f, 11.487f, 11.78f, 11.78f)
                curveTo(11.487f, 12.073f, 11.013f, 12.073f, 10.72f, 11.78f)
                lineTo(10f, 11.061f)
                lineTo(9.061f, 12f)
                lineTo(9.78f, 12.72f)
                curveTo(10.073f, 13.013f, 10.073f, 13.487f, 9.78f, 13.78f)
                curveTo(9.487f, 14.073f, 9.013f, 14.073f, 8.72f, 13.78f)
                lineTo(8f, 13.061f)
                lineTo(7.659f, 13.402f)
                curveTo(7.237f, 13.824f, 7f, 14.396f, 7f, 14.993f)
                verticalLineTo(17f)
                horizontalLineTo(9.007f)
                curveTo(9.604f, 17f, 10.176f, 16.763f, 10.598f, 16.341f)
                lineTo(17.439f, 9.5f)
                lineTo(14.5f, 6.561f)
                lineTo(13.061f, 8f)
                lineTo(13.78f, 8.72f)
                curveTo(14.073f, 9.013f, 14.073f, 9.487f, 13.78f, 9.78f)
                curveTo(13.487f, 10.073f, 13.013f, 10.073f, 12.72f, 9.78f)
                lineTo(12f, 9.061f)
                close()
                moveTo(19.194f, 5.749f)
                lineTo(18.254f, 4.81f)
                lineTo(16.561f, 6.5f)
                lineTo(17.5f, 7.439f)
                lineTo(19.194f, 5.749f)
                close()
            }
        }.build()

        return _Syringe!!
    }

@Suppress("ObjectPropertyName")
private var _Syringe: ImageVector? = null

@Preview
@Composable
private fun SyringePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Syringe, contentDescription = null)
    }
}

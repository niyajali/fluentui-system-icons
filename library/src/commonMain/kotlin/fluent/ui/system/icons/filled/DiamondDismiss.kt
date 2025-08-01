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

public val FluentIcons.Filled.DiamondDismiss: ImageVector
    get() {
        if (_DiamondDismiss != null) {
            return _DiamondDismiss!!
        }
        _DiamondDismiss = ImageVector.Builder(
            name = "Filled.DiamondDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.952f, 14.299f)
                curveTo(1.683f, 13.029f, 1.683f, 10.972f, 2.952f, 9.702f)
                lineTo(9.702f, 2.952f)
                curveTo(10.972f, 1.683f, 13.029f, 1.683f, 14.299f, 2.952f)
                lineTo(21.049f, 9.702f)
                curveTo(22.318f, 10.972f, 22.318f, 13.029f, 21.049f, 14.299f)
                lineTo(14.299f, 21.049f)
                curveTo(13.029f, 22.318f, 10.972f, 22.318f, 9.702f, 21.049f)
                lineTo(2.952f, 14.299f)
                close()
                moveTo(9.78f, 8.72f)
                curveTo(9.487f, 8.427f, 9.013f, 8.427f, 8.72f, 8.72f)
                curveTo(8.427f, 9.013f, 8.427f, 9.487f, 8.72f, 9.78f)
                lineTo(10.939f, 12f)
                lineTo(8.72f, 14.22f)
                curveTo(8.427f, 14.513f, 8.427f, 14.987f, 8.72f, 15.28f)
                curveTo(9.013f, 15.573f, 9.487f, 15.573f, 9.78f, 15.28f)
                lineTo(12f, 13.061f)
                lineTo(14.22f, 15.28f)
                curveTo(14.513f, 15.573f, 14.987f, 15.573f, 15.28f, 15.28f)
                curveTo(15.573f, 14.987f, 15.573f, 14.513f, 15.28f, 14.22f)
                lineTo(13.061f, 12f)
                lineTo(15.28f, 9.78f)
                curveTo(15.573f, 9.487f, 15.573f, 9.013f, 15.28f, 8.72f)
                curveTo(14.987f, 8.427f, 14.513f, 8.427f, 14.22f, 8.72f)
                lineTo(12f, 10.939f)
                lineTo(9.78f, 8.72f)
                close()
            }
        }.build()

        return _DiamondDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _DiamondDismiss: ImageVector? = null

@Preview
@Composable
private fun DiamondDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DiamondDismiss, contentDescription = null)
    }
}

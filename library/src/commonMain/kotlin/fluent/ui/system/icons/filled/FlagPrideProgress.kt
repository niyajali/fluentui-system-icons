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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.FlagPrideProgress: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagPrideProgress",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFFE62C46))) {
            moveTo(4f, 4f)
            horizontalLineTo(20f)
            verticalLineTo(6.5f)
            horizontalLineTo(4f)
            verticalLineTo(4f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF36D38))) {
            moveTo(4f, 6f)
            horizontalLineTo(20f)
            verticalLineTo(8.5f)
            horizontalLineTo(4f)
            verticalLineTo(6f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD23E))) {
            moveTo(4f, 8f)
            horizontalLineTo(20f)
            verticalLineTo(10.5f)
            horizontalLineTo(4f)
            verticalLineTo(8f)
            close()
        }
        path(fill = SolidColor(Color(0xFF61BC51))) {
            moveTo(4f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(12.5f)
            horizontalLineTo(4f)
            verticalLineTo(10f)
            close()
        }
        path(fill = SolidColor(Color(0xFF1793E8))) {
            moveTo(4f, 12f)
            horizontalLineTo(20f)
            verticalLineTo(14f)
            horizontalLineTo(4f)
            verticalLineTo(12f)
            close()
        }
        path(fill = SolidColor(Color(0xFFB73FBB))) {
            moveTo(4f, 13.5f)
            horizontalLineTo(20f)
            verticalLineTo(15.25f)
            horizontalLineTo(4f)
            verticalLineTo(13.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFF5B3B1C))) {
            moveTo(15f, 10f)
            lineTo(9f, 4f)
            horizontalLineTo(7f)
            verticalLineTo(15.5f)
            horizontalLineTo(9.5f)
            lineTo(15f, 10f)
            close()
        }
        path(fill = SolidColor(Color(0xFF8ED4EA))) {
            moveTo(12.5f, 10f)
            lineTo(6.5f, 4f)
            horizontalLineTo(4.5f)
            verticalLineTo(15.5f)
            horizontalLineTo(7f)
            lineTo(12.5f, 10f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF3B2C7))) {
            moveTo(10f, 10f)
            lineTo(4f, 4f)
            verticalLineTo(16f)
            lineTo(10f, 10f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFFFFF))) {
            moveTo(7.5f, 10f)
            lineTo(4.5f, 7f)
            lineTo(4f, 10f)
            lineTo(4.5f, 13f)
            lineTo(7.5f, 10f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 3f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            verticalLineTo(21.25f)
            curveTo(3f, 21.664f, 3.336f, 22f, 3.75f, 22f)
            curveTo(4.164f, 22f, 4.5f, 21.664f, 4.5f, 21.25f)
            lineTo(4.5f, 16.5f)
            horizontalLineTo(10.5f)
            lineTo(10.53f, 16.53f)
            lineTo(10.561f, 16.5f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 16.5f, 21f, 16.164f, 21f, 15.75f)
            verticalLineTo(3.75f)
            curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
            horizontalLineTo(10.061f)
            lineTo(10.03f, 2.97f)
            lineTo(10f, 3f)
            close()
            moveTo(9.439f, 4.5f)
            lineTo(14.939f, 10f)
            lineTo(9.939f, 15f)
            horizontalLineTo(4.5f)
            verticalLineTo(4.5f)
            horizontalLineTo(9.439f)
            close()
            moveTo(11.561f, 4.5f)
            horizontalLineTo(19.5f)
            verticalLineTo(15f)
            horizontalLineTo(12.061f)
            lineTo(16.53f, 10.53f)
            curveTo(16.823f, 10.237f, 16.823f, 9.763f, 16.53f, 9.47f)
            lineTo(11.561f, 4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlagPrideProgressPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FlagPrideProgress, contentDescription = null)
    }
}

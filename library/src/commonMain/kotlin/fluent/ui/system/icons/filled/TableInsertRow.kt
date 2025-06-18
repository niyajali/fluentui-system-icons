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

public val FluentUi.Filled.TableInsertRow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableInsertRow",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.25f, 4.5f)
            lineTo(3.75f, 4.5f)
            curveTo(3.336f, 4.5f, 3f, 4.164f, 3f, 3.75f)
            curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 3f, 21f, 3.336f, 21f, 3.75f)
            curveTo(21f, 4.164f, 20.664f, 4.5f, 20.25f, 4.5f)
            close()
            moveTo(8f, 8f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 8f, 3f, 8.895f, 3f, 10f)
            verticalLineTo(14f)
            curveTo(3f, 15.105f, 4.007f, 16f, 5.25f, 16f)
            horizontalLineTo(8f)
            lineTo(8f, 8f)
            close()
            moveTo(9.5f, 16f)
            horizontalLineTo(14.5f)
            lineTo(14.5f, 8f)
            horizontalLineTo(9.5f)
            lineTo(9.5f, 16f)
            close()
            moveTo(18.75f, 16f)
            horizontalLineTo(16f)
            lineTo(16f, 8f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 8f, 21f, 8.895f, 21f, 10f)
            verticalLineTo(14f)
            curveTo(21f, 15.105f, 19.993f, 16f, 18.75f, 16f)
            close()
            moveTo(3.75f, 21f)
            lineTo(20.25f, 21f)
            curveTo(20.664f, 21f, 21f, 20.664f, 21f, 20.25f)
            curveTo(21f, 19.836f, 20.664f, 19.5f, 20.25f, 19.5f)
            lineTo(3.75f, 19.5f)
            curveTo(3.336f, 19.5f, 3f, 19.836f, 3f, 20.25f)
            curveTo(3f, 20.664f, 3.336f, 21f, 3.75f, 21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableInsertRowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TableInsertRow, contentDescription = null)
    }
}

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

public val FluentUi.Filled.TableStackLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(16f)
            lineTo(16f, 16f)
            lineTo(16f, 21f)
            close()
            moveTo(16f, 14.5f)
            lineTo(21f, 14.5f)
            lineTo(21f, 9.5f)
            lineTo(16f, 9.5f)
            lineTo(16f, 14.5f)
            close()
            moveTo(14.5f, 9.5f)
            lineTo(14.5f, 14.5f)
            lineTo(9.5f, 14.5f)
            lineTo(9.5f, 9.5f)
            lineTo(14.5f, 9.5f)
            close()
            moveTo(16f, 8f)
            lineTo(21f, 8f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(16f)
            lineTo(16f, 8f)
            close()
            moveTo(14.5f, 3f)
            lineTo(14.5f, 8f)
            lineTo(9.5f, 8f)
            lineTo(9.5f, 3.75f)
            curveTo(9.5f, 3.551f, 9.579f, 3.36f, 9.72f, 3.22f)
            curveTo(9.86f, 3.079f, 10.051f, 3f, 10.25f, 3f)
            horizontalLineTo(14.5f)
            close()
            moveTo(14.5f, 16f)
            lineTo(14.5f, 21f)
            lineTo(10.25f, 21f)
            curveTo(9.836f, 21f, 9.5f, 20.664f, 9.5f, 20.25f)
            lineTo(9.5f, 16f)
            lineTo(14.5f, 16f)
            close()
            moveTo(4.5f, 3.75f)
            curveTo(4.5f, 3.336f, 4.164f, 3f, 3.75f, 3f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            verticalLineTo(20.25f)
            curveTo(3f, 20.664f, 3.336f, 21f, 3.75f, 21f)
            curveTo(4.164f, 21f, 4.5f, 20.664f, 4.5f, 20.25f)
            lineTo(4.5f, 3.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableStackLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TableStackLeft, contentDescription = null)
    }
}

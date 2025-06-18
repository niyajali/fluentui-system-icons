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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.TableStackRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(8f)
            lineTo(8f, 8f)
            lineTo(8f, 3f)
            close()
            moveTo(8f, 9.5f)
            lineTo(3f, 9.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(8f)
            lineTo(8f, 9.5f)
            close()
            moveTo(9.5f, 14.5f)
            lineTo(9.5f, 9.5f)
            lineTo(14.5f, 9.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(9.5f)
            close()
            moveTo(8f, 16f)
            horizontalLineTo(3f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(8f)
            lineTo(8f, 16f)
            close()
            moveTo(9.5f, 21f)
            lineTo(9.5f, 16f)
            horizontalLineTo(14.5f)
            verticalLineTo(20.25f)
            curveTo(14.5f, 20.449f, 14.421f, 20.64f, 14.28f, 20.78f)
            curveTo(14.14f, 20.921f, 13.949f, 21f, 13.75f, 21f)
            horizontalLineTo(9.5f)
            close()
            moveTo(9.5f, 8f)
            lineTo(9.5f, 3f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 3f, 14.5f, 3.336f, 14.5f, 3.75f)
            verticalLineTo(8f)
            lineTo(9.5f, 8f)
            close()
            moveTo(19.5f, 20.25f)
            curveTo(19.5f, 20.664f, 19.836f, 21f, 20.25f, 21f)
            curveTo(20.664f, 21f, 21f, 20.664f, 21f, 20.25f)
            verticalLineTo(3.75f)
            curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
            curveTo(19.836f, 3f, 19.5f, 3.336f, 19.5f, 3.75f)
            verticalLineTo(20.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableStackRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableStackRight, contentDescription = null)
    }
}

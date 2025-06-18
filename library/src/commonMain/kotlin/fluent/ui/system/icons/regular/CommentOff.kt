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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.CommentOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CommentOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(2.922f, 3.982f)
            curveTo(2.351f, 4.568f, 2f, 5.368f, 2f, 6.25f)
            verticalLineTo(14.75f)
            curveTo(2f, 16.545f, 3.455f, 18f, 5.25f, 18f)
            horizontalLineTo(5.999f)
            lineTo(6f, 20.75f)
            curveTo(6f, 21.02f, 6.087f, 21.282f, 6.249f, 21.498f)
            curveTo(6.662f, 22.051f, 7.446f, 22.164f, 7.999f, 21.751f)
            lineTo(13.012f, 18f)
            horizontalLineTo(16.939f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(15.439f, 16.5f)
            horizontalLineTo(12.514f)
            lineTo(7.5f, 20.251f)
            lineTo(7.499f, 16.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 16.5f, 3.5f, 15.717f, 3.5f, 14.75f)
            verticalLineTo(6.25f)
            curveTo(3.5f, 5.782f, 3.684f, 5.357f, 3.983f, 5.043f)
            lineTo(15.439f, 16.5f)
            close()
            moveTo(20.5f, 14.75f)
            curveTo(20.5f, 15.445f, 20.095f, 16.045f, 19.509f, 16.327f)
            lineTo(20.602f, 17.421f)
            curveTo(21.447f, 16.834f, 22f, 15.856f, 22f, 14.75f)
            verticalLineTo(6.25f)
            curveTo(22f, 4.455f, 20.545f, 3f, 18.75f, 3f)
            horizontalLineTo(6.182f)
            lineTo(7.682f, 4.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 4.5f, 20.5f, 5.284f, 20.5f, 6.25f)
            verticalLineTo(14.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CommentOff, contentDescription = null)
    }
}

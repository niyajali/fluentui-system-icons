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

public val FluentUi.Regular.CommentEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CommentEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 14.75f)
            curveTo(2f, 16.545f, 3.455f, 18f, 5.25f, 18f)
            horizontalLineTo(5.999f)
            lineTo(6f, 20.75f)
            curveTo(6f, 21.02f, 6.087f, 21.282f, 6.249f, 21.498f)
            curveTo(6.662f, 22.051f, 7.446f, 22.164f, 7.999f, 21.751f)
            lineTo(10.124f, 20.161f)
            lineTo(10.52f, 18.577f)
            curveTo(10.591f, 18.291f, 10.696f, 18.016f, 10.832f, 17.758f)
            lineTo(7.5f, 20.251f)
            lineTo(7.499f, 16.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 16.5f, 3.5f, 15.717f, 3.5f, 14.75f)
            verticalLineTo(6.25f)
            curveTo(3.5f, 5.284f, 4.284f, 4.5f, 5.25f, 4.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 4.5f, 20.5f, 5.284f, 20.5f, 6.25f)
            verticalLineTo(10.095f)
            curveTo(21.048f, 10.229f, 21.567f, 10.505f, 22f, 10.925f)
            verticalLineTo(6.25f)
            curveTo(22f, 4.455f, 20.545f, 3f, 18.75f, 3f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            verticalLineTo(14.75f)
            close()
            moveTo(18.098f, 11.67f)
            lineTo(12.196f, 17.572f)
            curveTo(11.851f, 17.916f, 11.607f, 18.347f, 11.489f, 18.819f)
            lineTo(11.031f, 20.65f)
            curveTo(10.833f, 21.446f, 11.554f, 22.167f, 12.35f, 21.968f)
            lineTo(14.18f, 21.511f)
            curveTo(14.653f, 21.393f, 15.084f, 21.149f, 15.428f, 20.804f)
            lineTo(21.33f, 14.902f)
            curveTo(22.223f, 14.009f, 22.223f, 12.562f, 21.33f, 11.67f)
            curveTo(20.438f, 10.777f, 18.99f, 10.777f, 18.098f, 11.67f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CommentEdit, contentDescription = null)
    }
}

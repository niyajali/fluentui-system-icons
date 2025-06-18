/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ImageAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 6.5f)
            curveTo(12f, 3.462f, 9.538f, 1f, 6.5f, 1f)
            curveTo(3.462f, 1f, 1f, 3.462f, 1f, 6.5f)
            curveTo(1f, 9.538f, 3.462f, 12f, 6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 9.538f, 12f, 6.5f)
            close()
            moveTo(7.001f, 7f)
            lineTo(7.001f, 9.504f)
            curveTo(7.001f, 9.78f, 6.777f, 10.003f, 6.501f, 10.003f)
            curveTo(6.225f, 10.003f, 6.001f, 9.78f, 6.001f, 9.504f)
            lineTo(6.001f, 7f)
            horizontalLineTo(3.496f)
            curveTo(3.22f, 7f, 2.996f, 6.776f, 2.996f, 6.5f)
            curveTo(2.996f, 6.224f, 3.22f, 6f, 3.496f, 6f)
            horizontalLineTo(6f)
            lineTo(6f, 3.499f)
            curveTo(6f, 3.223f, 6.224f, 2.999f, 6.5f, 2.999f)
            curveTo(6.776f, 2.999f, 7f, 3.223f, 7f, 3.499f)
            lineTo(7f, 6f)
            horizontalLineTo(9.497f)
            curveTo(9.772f, 6f, 9.996f, 6.224f, 9.996f, 6.5f)
            curveTo(9.996f, 6.776f, 9.772f, 7f, 9.497f, 7f)
            horizontalLineTo(7.001f)
            close()
            moveTo(17.75f, 4.5f)
            horizontalLineTo(12.686f)
            curveTo(12.514f, 3.967f, 12.275f, 3.463f, 11.978f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(11.978f)
            curveTo(3.463f, 12.275f, 3.967f, 12.514f, 4.5f, 12.686f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 17.958f, 4.536f, 18.158f, 4.603f, 18.344f)
            lineTo(10.426f, 12.643f)
            curveTo(11.259f, 11.827f, 12.568f, 11.788f, 13.446f, 12.527f)
            lineTo(13.574f, 12.643f)
            lineTo(19.396f, 18.345f)
            curveTo(19.463f, 18.159f, 19.5f, 17.959f, 19.5f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            close()
            moveTo(18.33f, 19.401f)
            lineTo(12.525f, 13.715f)
            curveTo(12.26f, 13.455f, 11.85f, 13.432f, 11.559f, 13.644f)
            lineTo(11.475f, 13.715f)
            lineTo(5.668f, 19.401f)
            curveTo(5.85f, 19.465f, 6.046f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(17.954f, 19.5f, 18.149f, 19.465f, 18.33f, 19.401f)
            close()
            moveTo(15.252f, 6.5f)
            curveTo(16.496f, 6.5f, 17.504f, 7.508f, 17.504f, 8.752f)
            curveTo(17.504f, 9.996f, 16.496f, 11.004f, 15.252f, 11.004f)
            curveTo(14.008f, 11.004f, 13f, 9.996f, 13f, 8.752f)
            curveTo(13f, 7.508f, 14.008f, 6.5f, 15.252f, 6.5f)
            close()
            moveTo(15.252f, 8f)
            curveTo(14.837f, 8f, 14.5f, 8.337f, 14.5f, 8.752f)
            curveTo(14.5f, 9.167f, 14.837f, 9.504f, 15.252f, 9.504f)
            curveTo(15.667f, 9.504f, 16.004f, 9.167f, 16.004f, 8.752f)
            curveTo(16.004f, 8.337f, 15.667f, 8f, 15.252f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ImageAdd, contentDescription = null)
    }
}

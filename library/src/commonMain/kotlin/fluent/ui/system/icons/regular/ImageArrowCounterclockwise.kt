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

public val FluentUi.Regular.ImageArrowCounterclockwise: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Regular.ImageArrowCounterclockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 6.5f)
                curveTo(12f, 3.462f, 9.538f, 1f, 6.5f, 1f)
                curveTo(3.462f, 1f, 1f, 3.462f, 1f, 6.5f)
                curveTo(1f, 9.538f, 3.462f, 12f, 6.5f, 12f)
                curveTo(9.538f, 12f, 12f, 9.538f, 12f, 6.5f)
                close()
                moveTo(4f, 3.5f)
                verticalLineTo(4.051f)
                curveTo(4.635f, 3.403f, 5.521f, 3f, 6.501f, 3f)
                curveTo(8.434f, 3f, 10.001f, 4.567f, 10.001f, 6.5f)
                curveTo(10.001f, 8.433f, 8.434f, 10f, 6.501f, 10f)
                curveTo(5.421f, 10f, 4.455f, 9.511f, 3.813f, 8.742f)
                curveTo(3.55f, 8.427f, 3.811f, 8f, 4.221f, 8f)
                curveTo(4.397f, 8f, 4.56f, 8.085f, 4.68f, 8.213f)
                curveTo(5.136f, 8.698f, 5.783f, 9f, 6.501f, 9f)
                curveTo(7.881f, 9f, 9.001f, 7.881f, 9.001f, 6.5f)
                curveTo(9.001f, 5.119f, 7.881f, 4f, 6.501f, 4f)
                curveTo(5.683f, 4f, 4.957f, 4.393f, 4.501f, 5f)
                horizontalLineTo(5.5f)
                curveTo(5.776f, 5f, 6f, 5.224f, 6f, 5.5f)
                curveTo(6f, 5.776f, 5.776f, 6f, 5.5f, 6f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 6f, 3f, 5.776f, 3f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(3f, 3.224f, 3.224f, 3f, 3.5f, 3f)
                curveTo(3.776f, 3f, 4f, 3.224f, 4f, 3.5f)
                close()
                moveTo(18.75f, 5.5f)
                horizontalLineTo(12.924f)
                curveTo(12.843f, 4.977f, 12.7f, 4.474f, 12.502f, 4f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
                verticalLineTo(18.75f)
                curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
                horizontalLineTo(7.25f)
                curveTo(5.455f, 22f, 4f, 20.545f, 4f, 18.75f)
                verticalLineTo(12.502f)
                curveTo(4.474f, 12.7f, 4.977f, 12.843f, 5.5f, 12.924f)
                verticalLineTo(18.75f)
                curveTo(5.5f, 18.958f, 5.536f, 19.158f, 5.603f, 19.344f)
                lineTo(11.426f, 13.643f)
                curveTo(12.259f, 12.827f, 13.568f, 12.788f, 14.446f, 13.527f)
                lineTo(14.574f, 13.643f)
                lineTo(20.396f, 19.345f)
                curveTo(20.463f, 19.159f, 20.5f, 18.959f, 20.5f, 18.75f)
                verticalLineTo(7.25f)
                curveTo(20.5f, 6.284f, 19.716f, 5.5f, 18.75f, 5.5f)
                close()
                moveTo(19.33f, 20.401f)
                lineTo(13.525f, 14.715f)
                curveTo(13.26f, 14.455f, 12.85f, 14.432f, 12.559f, 14.644f)
                lineTo(12.475f, 14.715f)
                lineTo(6.668f, 20.401f)
                curveTo(6.85f, 20.465f, 7.046f, 20.5f, 7.25f, 20.5f)
                horizontalLineTo(18.75f)
                curveTo(18.954f, 20.5f, 19.149f, 20.465f, 19.33f, 20.401f)
                close()
                moveTo(16.252f, 7.5f)
                curveTo(17.496f, 7.5f, 18.504f, 8.508f, 18.504f, 9.752f)
                curveTo(18.504f, 10.996f, 17.496f, 12.004f, 16.252f, 12.004f)
                curveTo(15.008f, 12.004f, 14f, 10.996f, 14f, 9.752f)
                curveTo(14f, 8.508f, 15.008f, 7.5f, 16.252f, 7.5f)
                close()
                moveTo(16.252f, 9f)
                curveTo(15.837f, 9f, 15.5f, 9.337f, 15.5f, 9.752f)
                curveTo(15.5f, 10.167f, 15.837f, 10.504f, 16.252f, 10.504f)
                curveTo(16.667f, 10.504f, 17.004f, 10.167f, 17.004f, 9.752f)
                curveTo(17.004f, 9.337f, 16.667f, 9f, 16.252f, 9f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun ImageArrowCounterclockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ImageArrowCounterclockwise, contentDescription = null)
    }
}

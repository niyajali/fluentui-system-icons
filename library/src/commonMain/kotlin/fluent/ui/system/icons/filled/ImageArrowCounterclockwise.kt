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

public val FluentIcons.Filled.ImageArrowCounterclockwise: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.ImageArrowCounterclockwise",
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
                moveTo(17.504f, 9.252f)
                curveTo(17.504f, 8.837f, 17.167f, 8.5f, 16.752f, 8.5f)
                curveTo(16.337f, 8.5f, 16f, 8.837f, 16f, 9.252f)
                curveTo(16f, 9.667f, 16.337f, 10.004f, 16.752f, 10.004f)
                curveTo(17.167f, 10.004f, 17.504f, 9.667f, 17.504f, 9.252f)
                close()
                moveTo(13f, 6.5f)
                curveTo(13f, 10.09f, 10.09f, 13f, 6.5f, 13f)
                curveTo(5.614f, 13f, 4.77f, 12.823f, 4f, 12.502f)
                verticalLineTo(18.75f)
                curveTo(4f, 19.377f, 4.178f, 19.963f, 4.485f, 20.459f)
                lineTo(11.424f, 13.648f)
                lineTo(11.559f, 13.525f)
                curveTo(12.394f, 12.827f, 13.615f, 12.829f, 14.448f, 13.531f)
                lineTo(14.576f, 13.648f)
                lineTo(21.515f, 20.459f)
                curveTo(21.822f, 19.963f, 22f, 19.377f, 22f, 18.75f)
                verticalLineTo(7.25f)
                curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
                horizontalLineTo(12.502f)
                curveTo(12.823f, 4.77f, 13f, 5.614f, 13f, 6.5f)
                close()
                moveTo(14.5f, 9.252f)
                curveTo(14.5f, 8.008f, 15.508f, 7f, 16.752f, 7f)
                curveTo(17.996f, 7f, 19.004f, 8.008f, 19.004f, 9.252f)
                curveTo(19.004f, 10.496f, 17.996f, 11.504f, 16.752f, 11.504f)
                curveTo(15.508f, 11.504f, 14.5f, 10.496f, 14.5f, 9.252f)
                close()
                moveTo(12.475f, 14.718f)
                lineTo(12.558f, 14.647f)
                curveTo(12.817f, 14.458f, 13.17f, 14.455f, 13.432f, 14.64f)
                lineTo(13.525f, 14.718f)
                lineTo(20.453f, 21.519f)
                curveTo(19.958f, 21.824f, 19.375f, 22f, 18.75f, 22f)
                horizontalLineTo(7.25f)
                curveTo(6.626f, 22f, 6.042f, 21.824f, 5.547f, 21.519f)
                lineTo(12.475f, 14.718f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun ImageArrowCounterclockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ImageArrowCounterclockwise, contentDescription = null)
    }
}

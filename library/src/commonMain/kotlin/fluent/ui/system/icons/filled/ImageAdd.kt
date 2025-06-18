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

public val FluentIcons.Filled.ImageAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageAdd",
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
            moveTo(6.5f, 13f)
            curveTo(10.09f, 13f, 13f, 10.09f, 13f, 6.5f)
            curveTo(13f, 5.211f, 12.625f, 4.01f, 11.978f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 18.377f, 20.822f, 18.963f, 20.515f, 19.459f)
            lineTo(13.576f, 12.648f)
            lineTo(13.448f, 12.531f)
            curveTo(12.615f, 11.829f, 11.394f, 11.827f, 10.559f, 12.525f)
            lineTo(10.424f, 12.648f)
            lineTo(3.485f, 19.459f)
            curveTo(3.178f, 18.963f, 3f, 18.377f, 3f, 17.75f)
            verticalLineTo(11.978f)
            curveTo(4.01f, 12.625f, 5.211f, 13f, 6.5f, 13f)
            close()
            moveTo(15.25f, 10.75f)
            curveTo(16.355f, 10.75f, 17.25f, 9.855f, 17.25f, 8.75f)
            curveTo(17.25f, 7.645f, 16.355f, 6.75f, 15.25f, 6.75f)
            curveTo(14.145f, 6.75f, 13.25f, 7.645f, 13.25f, 8.75f)
            curveTo(13.25f, 9.855f, 14.145f, 10.75f, 15.25f, 10.75f)
            close()
            moveTo(11.558f, 13.647f)
            lineTo(11.475f, 13.718f)
            lineTo(4.547f, 20.519f)
            curveTo(5.042f, 20.824f, 5.626f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(18.375f, 21f, 18.958f, 20.824f, 19.453f, 20.519f)
            lineTo(12.525f, 13.718f)
            lineTo(12.432f, 13.64f)
            curveTo(12.17f, 13.455f, 11.817f, 13.458f, 11.558f, 13.647f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ImageAdd, contentDescription = null)
    }
}

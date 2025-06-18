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

public val FluentIcons.Filled.TableAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.5f, 21f)
            horizontalLineTo(12.022f)
            curveTo(11.375f, 19.99f, 11f, 18.789f, 11f, 17.5f)
            curveTo(11f, 16.984f, 11.06f, 16.482f, 11.174f, 16f)
            horizontalLineTo(9.5f)
            lineTo(9.5f, 21f)
            close()
            moveTo(21f, 9.5f)
            verticalLineTo(12.022f)
            curveTo(19.99f, 11.375f, 18.789f, 11f, 17.5f, 11f)
            curveTo(16.984f, 11f, 16.482f, 11.06f, 16f, 11.174f)
            verticalLineTo(9.5f)
            horizontalLineTo(21f)
            close()
            moveTo(14.5f, 9.5f)
            verticalLineTo(11.732f)
            curveTo(13.318f, 12.349f, 12.349f, 13.318f, 11.732f, 14.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(14.5f)
            close()
            moveTo(21f, 8f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(16f)
            verticalLineTo(8f)
            horizontalLineTo(21f)
            close()
            moveTo(14.5f, 3f)
            horizontalLineTo(9.5f)
            lineTo(9.5f, 8f)
            horizontalLineTo(14.5f)
            verticalLineTo(3f)
            close()
            moveTo(8f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(8f)
            lineTo(8f, 3f)
            close()
            moveTo(3f, 9.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(8f)
            verticalLineTo(9.5f)
            horizontalLineTo(3f)
            close()
            moveTo(3f, 16f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(8f)
            lineTo(8f, 16f)
            horizontalLineTo(3f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(18.001f, 18f)
            lineTo(18.001f, 20.503f)
            curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
            curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
            lineTo(17.001f, 18f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
            curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
            horizontalLineTo(17f)
            lineTo(17f, 14.499f)
            curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
            curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
            lineTo(18f, 17f)
            horizontalLineTo(20.503f)
            curveTo(20.779f, 17f, 21.003f, 17.224f, 21.003f, 17.5f)
            curveTo(21.003f, 17.776f, 20.779f, 18f, 20.503f, 18f)
            horizontalLineTo(18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableAdd, contentDescription = null)
    }
}

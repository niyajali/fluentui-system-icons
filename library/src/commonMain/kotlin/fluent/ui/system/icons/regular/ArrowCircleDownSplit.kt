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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.ArrowCircleDownSplit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleDownSplit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 13.998f)
            lineTo(10.916f, 13.926f)
            curveTo(10.622f, 13.708f, 10.205f, 13.732f, 9.939f, 13.998f)
            lineTo(9.5f, 14.437f)
            lineTo(9.5f, 10.499f)
            lineTo(14.5f, 10.499f)
            lineTo(14.5f, 14.439f)
            lineTo(13.988f, 13.999f)
            lineTo(13.904f, 13.926f)
            curveTo(13.61f, 13.708f, 13.194f, 13.732f, 12.927f, 13.998f)
            curveTo(12.634f, 14.291f, 12.634f, 14.766f, 12.927f, 15.059f)
            lineTo(14.719f, 16.779f)
            lineTo(14.803f, 16.852f)
            curveTo(15.096f, 17.07f, 15.513f, 17.046f, 15.779f, 16.779f)
            lineTo(17.499f, 15.059f)
            lineTo(17.572f, 14.975f)
            curveTo(17.79f, 14.682f, 17.766f, 14.265f, 17.499f, 13.999f)
            lineTo(17.415f, 13.926f)
            curveTo(17.122f, 13.708f, 16.705f, 13.732f, 16.439f, 13.999f)
            lineTo(16f, 14.437f)
            lineTo(16f, 9.748f)
            lineTo(15.993f, 9.646f)
            curveTo(15.943f, 9.28f, 15.629f, 8.998f, 15.25f, 8.998f)
            lineTo(15.231f, 8.999f)
            horizontalLineTo(12.75f)
            lineTo(12.749f, 5.747f)
            lineTo(12.743f, 5.646f)
            curveTo(12.693f, 5.28f, 12.379f, 4.997f, 11.999f, 4.997f)
            lineTo(11.898f, 5.004f)
            curveTo(11.532f, 5.054f, 11.249f, 5.368f, 11.249f, 5.747f)
            lineTo(11.25f, 8.999f)
            horizontalLineTo(8.793f)
            curveTo(8.779f, 8.998f, 8.764f, 8.998f, 8.75f, 8.998f)
            lineTo(8.648f, 9.004f)
            curveTo(8.282f, 9.054f, 8f, 9.368f, 8f, 9.748f)
            lineTo(8f, 14.439f)
            lineTo(7.561f, 13.998f)
            lineTo(7.477f, 13.926f)
            curveTo(7.183f, 13.708f, 6.766f, 13.732f, 6.5f, 13.998f)
            curveTo(6.207f, 14.291f, 6.207f, 14.766f, 6.5f, 15.059f)
            lineTo(8.219f, 16.779f)
            lineTo(8.303f, 16.852f)
            curveTo(8.596f, 17.07f, 9.013f, 17.046f, 9.28f, 16.779f)
            lineTo(11f, 15.059f)
            lineTo(11.073f, 14.975f)
            curveTo(11.29f, 14.681f, 11.266f, 14.265f, 11f, 13.998f)
            close()
            moveTo(1.999f, 11.998f)
            curveTo(1.999f, 17.521f, 6.476f, 21.998f, 11.999f, 21.998f)
            curveTo(17.522f, 21.998f, 21.999f, 17.521f, 21.999f, 11.998f)
            curveTo(21.999f, 6.475f, 17.522f, 1.998f, 11.999f, 1.998f)
            curveTo(6.476f, 1.998f, 1.999f, 6.475f, 1.999f, 11.998f)
            close()
            moveTo(20.499f, 11.998f)
            curveTo(20.499f, 16.692f, 16.693f, 20.498f, 11.999f, 20.498f)
            curveTo(7.305f, 20.498f, 3.499f, 16.692f, 3.499f, 11.998f)
            curveTo(3.499f, 7.304f, 7.305f, 3.498f, 11.999f, 3.498f)
            curveTo(16.693f, 3.498f, 20.499f, 7.304f, 20.499f, 11.998f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowCircleDownSplitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowCircleDownSplit, contentDescription = null)
    }
}

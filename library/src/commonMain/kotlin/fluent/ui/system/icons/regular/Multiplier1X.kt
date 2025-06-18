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

public val FluentIcons.Regular.Multiplier1X: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Multiplier1X",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 7.75f)
            curveTo(10f, 7.414f, 9.776f, 7.119f, 9.453f, 7.028f)
            curveTo(9.129f, 6.937f, 8.785f, 7.072f, 8.61f, 7.359f)
            lineTo(8.609f, 7.36f)
            lineTo(8.604f, 7.369f)
            curveTo(8.599f, 7.377f, 8.59f, 7.391f, 8.577f, 7.41f)
            curveTo(8.553f, 7.448f, 8.514f, 7.506f, 8.463f, 7.579f)
            curveTo(8.36f, 7.726f, 8.205f, 7.933f, 8.006f, 8.168f)
            curveTo(7.604f, 8.642f, 7.04f, 9.202f, 6.364f, 9.607f)
            curveTo(6.009f, 9.82f, 5.894f, 10.281f, 6.107f, 10.636f)
            curveTo(6.32f, 10.991f, 6.781f, 11.106f, 7.136f, 10.893f)
            curveTo(7.66f, 10.579f, 8.118f, 10.202f, 8.5f, 9.833f)
            verticalLineTo(16.25f)
            curveTo(8.5f, 16.664f, 8.836f, 17f, 9.25f, 17f)
            curveTo(9.664f, 17f, 10f, 16.664f, 10f, 16.25f)
            verticalLineTo(7.75f)
            close()
            moveTo(13.281f, 12.22f)
            curveTo(12.988f, 11.927f, 12.513f, 11.927f, 12.22f, 12.22f)
            curveTo(11.927f, 12.513f, 11.927f, 12.988f, 12.22f, 13.28f)
            lineTo(13.439f, 14.5f)
            lineTo(12.22f, 15.72f)
            curveTo(11.927f, 16.013f, 11.927f, 16.487f, 12.22f, 16.78f)
            curveTo(12.513f, 17.073f, 12.988f, 17.073f, 13.281f, 16.78f)
            lineTo(14.5f, 15.561f)
            lineTo(15.72f, 16.78f)
            curveTo(16.013f, 17.073f, 16.487f, 17.073f, 16.78f, 16.78f)
            curveTo(17.073f, 16.487f, 17.073f, 16.013f, 16.78f, 15.72f)
            lineTo(15.561f, 14.5f)
            lineTo(16.78f, 13.28f)
            curveTo(17.073f, 12.988f, 17.073f, 12.513f, 16.78f, 12.22f)
            curveTo(16.487f, 11.927f, 16.013f, 11.927f, 15.72f, 12.22f)
            lineTo(14.5f, 13.439f)
            lineTo(13.281f, 12.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Multiplier1XPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Multiplier1X, contentDescription = null)
    }
}

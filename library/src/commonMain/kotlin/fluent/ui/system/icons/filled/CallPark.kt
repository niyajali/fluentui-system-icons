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

public val FluentIcons.Filled.CallPark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CallPark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.367f, 3.313f)
            lineTo(10.227f, 5.34f)
            curveTo(10.602f, 6.223f, 10.394f, 7.262f, 9.713f, 7.908f)
            lineTo(7.819f, 9.706f)
            curveTo(7.936f, 10.782f, 8.297f, 11.841f, 8.903f, 12.883f)
            curveTo(9.509f, 13.926f, 10.267f, 14.791f, 11.174f, 15.478f)
            lineTo(13.45f, 14.719f)
            curveTo(14.312f, 14.432f, 15.251f, 14.762f, 15.78f, 15.539f)
            lineTo(17.013f, 17.35f)
            curveTo(17.628f, 18.253f, 17.517f, 19.5f, 16.754f, 20.265f)
            lineTo(15.936f, 21.087f)
            curveTo(15.122f, 21.904f, 13.96f, 22.2f, 12.884f, 21.865f)
            curveTo(10.345f, 21.073f, 8.011f, 18.721f, 5.881f, 14.811f)
            curveTo(3.748f, 10.895f, 2.996f, 7.572f, 3.623f, 4.843f)
            curveTo(3.887f, 3.695f, 4.705f, 2.78f, 5.772f, 2.439f)
            lineTo(6.849f, 2.095f)
            curveTo(7.858f, 1.773f, 8.935f, 2.294f, 9.367f, 3.313f)
            close()
            moveTo(14.75f, 2f)
            horizontalLineTo(17.246f)
            curveTo(19.636f, 2f, 21f, 3.136f, 21f, 5.25f)
            curveTo(21f, 7.294f, 19.725f, 8.423f, 17.482f, 8.493f)
            lineTo(17.246f, 8.497f)
            lineTo(15.5f, 8.497f)
            verticalLineTo(11.256f)
            curveTo(15.5f, 11.67f, 15.165f, 12.006f, 14.75f, 12.006f)
            curveTo(14.371f, 12.006f, 14.057f, 11.724f, 14.007f, 11.358f)
            lineTo(14f, 11.256f)
            verticalLineTo(2.75f)
            curveTo(14f, 2.37f, 14.283f, 2.057f, 14.649f, 2.007f)
            lineTo(14.75f, 2f)
            horizontalLineTo(17.246f)
            horizontalLineTo(14.75f)
            close()
            moveTo(17.246f, 3.5f)
            horizontalLineTo(15.5f)
            verticalLineTo(6.997f)
            lineTo(17.247f, 6.997f)
            curveTo(18.863f, 6.998f, 19.5f, 6.468f, 19.5f, 5.25f)
            curveTo(19.5f, 4.082f, 18.914f, 3.545f, 17.443f, 3.503f)
            lineTo(17.246f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallParkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CallPark, contentDescription = null)
    }
}

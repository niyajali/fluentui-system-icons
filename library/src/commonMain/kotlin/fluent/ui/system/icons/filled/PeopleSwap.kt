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

public val FluentIcons.Filled.PeopleSwap: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleSwap",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 8f)
            curveTo(12f, 10.209f, 10.209f, 12f, 8f, 12f)
            curveTo(5.791f, 12f, 4f, 10.209f, 4f, 8f)
            curveTo(4f, 5.791f, 5.791f, 4f, 8f, 4f)
            curveTo(10.209f, 4f, 12f, 5.791f, 12f, 8f)
            close()
            moveTo(20f, 9f)
            curveTo(20f, 10.657f, 18.657f, 12f, 17f, 12f)
            curveTo(15.343f, 12f, 14f, 10.657f, 14f, 9f)
            curveTo(14f, 7.343f, 15.343f, 6f, 17f, 6f)
            curveTo(18.657f, 6f, 20f, 7.343f, 20f, 9f)
            close()
            moveTo(2f, 16.25f)
            curveTo(2f, 15.007f, 3.007f, 14f, 4.25f, 14f)
            horizontalLineTo(11.75f)
            curveTo(12.12f, 14f, 12.469f, 14.089f, 12.777f, 14.248f)
            lineTo(10.513f, 16.513f)
            curveTo(9.829f, 17.196f, 9.829f, 18.304f, 10.513f, 18.987f)
            lineTo(11.699f, 20.174f)
            curveTo(10.833f, 20.663f, 9.641f, 21f, 8f, 21f)
            curveTo(2f, 21f, 2f, 16.5f, 2f, 16.5f)
            verticalLineTo(16.25f)
            close()
            moveTo(20.281f, 14.72f)
            curveTo(19.988f, 14.427f, 19.513f, 14.427f, 19.22f, 14.72f)
            curveTo(18.927f, 15.013f, 18.927f, 15.488f, 19.22f, 15.781f)
            lineTo(20.439f, 17f)
            horizontalLineTo(13.561f)
            lineTo(14.78f, 15.781f)
            curveTo(15.073f, 15.488f, 15.073f, 15.013f, 14.78f, 14.72f)
            curveTo(14.487f, 14.427f, 14.012f, 14.427f, 13.719f, 14.72f)
            lineTo(11.22f, 17.22f)
            curveTo(10.927f, 17.513f, 10.927f, 17.987f, 11.22f, 18.28f)
            lineTo(13.719f, 20.78f)
            curveTo(14.012f, 21.073f, 14.487f, 21.073f, 14.78f, 20.78f)
            curveTo(15.073f, 20.487f, 15.073f, 20.012f, 14.78f, 19.719f)
            lineTo(13.561f, 18.5f)
            horizontalLineTo(20.439f)
            lineTo(19.22f, 19.719f)
            curveTo(18.927f, 20.012f, 18.927f, 20.487f, 19.22f, 20.78f)
            curveTo(19.513f, 21.073f, 19.988f, 21.073f, 20.281f, 20.78f)
            lineTo(22.78f, 18.28f)
            curveTo(23.073f, 17.987f, 23.073f, 17.513f, 22.78f, 17.22f)
            lineTo(20.281f, 14.72f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleSwapPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PeopleSwap, contentDescription = null)
    }
}

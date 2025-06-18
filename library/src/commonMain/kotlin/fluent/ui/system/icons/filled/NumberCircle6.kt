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

public val FluentIcons.Filled.NumberCircle6: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle6",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            close()
            moveTo(12f, 11.5f)
            curveTo(13.354f, 11.5f, 14.25f, 12.485f, 14.25f, 13.75f)
            curveTo(14.25f, 14.993f, 13.243f, 16f, 12f, 16f)
            curveTo(10.757f, 16f, 9.75f, 14.993f, 9.75f, 13.75f)
            curveTo(9.75f, 12.507f, 10.757f, 11.5f, 12f, 11.5f)
            close()
            moveTo(12f, 17.5f)
            curveTo(10.825f, 17.5f, 9.729f, 17.037f, 8.943f, 16.066f)
            curveTo(8.168f, 15.111f, 7.75f, 13.737f, 7.75f, 12f)
            curveTo(7.75f, 10.611f, 8.012f, 9.259f, 8.685f, 8.231f)
            curveTo(9.386f, 7.159f, 10.498f, 6.5f, 12f, 6.5f)
            curveTo(13.248f, 6.5f, 14.242f, 6.955f, 14.951f, 7.754f)
            curveTo(15.227f, 8.064f, 15.198f, 8.538f, 14.889f, 8.813f)
            curveTo(14.579f, 9.088f, 14.105f, 9.06f, 13.83f, 8.75f)
            curveTo(13.424f, 8.293f, 12.849f, 8f, 12f, 8f)
            curveTo(11.002f, 8f, 10.364f, 8.405f, 9.94f, 9.052f)
            curveTo(9.596f, 9.578f, 9.375f, 10.298f, 9.29f, 11.158f)
            curveTo(9.973f, 10.444f, 10.934f, 10f, 12f, 10f)
            curveTo(14.227f, 10f, 15.75f, 11.701f, 15.75f, 13.75f)
            curveTo(15.75f, 15.821f, 14.071f, 17.5f, 12f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NumberCircle6Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NumberCircle6, contentDescription = null)
    }
}

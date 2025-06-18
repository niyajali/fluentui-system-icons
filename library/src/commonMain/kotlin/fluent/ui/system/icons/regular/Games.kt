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

public val FluentIcons.Regular.Games: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Games",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.998f, 5f)
            curveTo(18.864f, 5f, 21.998f, 8.134f, 21.998f, 12f)
            curveTo(21.998f, 15.785f, 18.993f, 18.869f, 15.238f, 18.996f)
            lineTo(14.998f, 19f)
            horizontalLineTo(9.002f)
            curveTo(5.136f, 19f, 2.002f, 15.866f, 2.002f, 12f)
            curveTo(2.002f, 8.215f, 5.007f, 5.131f, 8.761f, 5.004f)
            lineTo(9.002f, 5f)
            horizontalLineTo(14.998f)
            close()
            moveTo(14.998f, 6.5f)
            horizontalLineTo(9.002f)
            curveTo(5.965f, 6.5f, 3.502f, 8.962f, 3.502f, 12f)
            curveTo(3.502f, 14.964f, 5.846f, 17.379f, 8.781f, 17.496f)
            lineTo(9.002f, 17.5f)
            horizontalLineTo(14.998f)
            curveTo(18.035f, 17.5f, 20.498f, 15.038f, 20.498f, 12f)
            curveTo(20.498f, 9.037f, 18.154f, 6.62f, 15.219f, 6.504f)
            lineTo(14.998f, 6.5f)
            close()
            moveTo(8f, 9f)
            curveTo(8.414f, 9f, 8.75f, 9.336f, 8.75f, 9.75f)
            lineTo(8.749f, 11.248f)
            lineTo(10.25f, 11.249f)
            curveTo(10.664f, 11.249f, 11f, 11.585f, 11f, 11.999f)
            curveTo(11f, 12.413f, 10.664f, 12.749f, 10.25f, 12.749f)
            lineTo(8.749f, 12.748f)
            lineTo(8.75f, 14.25f)
            curveTo(8.75f, 14.664f, 8.414f, 15f, 8f, 15f)
            curveTo(7.586f, 15f, 7.25f, 14.664f, 7.25f, 14.25f)
            lineTo(7.249f, 12.748f)
            lineTo(5.75f, 12.749f)
            curveTo(5.336f, 12.749f, 5f, 12.413f, 5f, 11.999f)
            curveTo(5f, 11.585f, 5.336f, 11.249f, 5.75f, 11.249f)
            lineTo(7.249f, 11.248f)
            lineTo(7.25f, 9.75f)
            curveTo(7.25f, 9.336f, 7.586f, 9f, 8f, 9f)
            close()
            moveTo(14.75f, 12.5f)
            curveTo(15.44f, 12.5f, 16f, 13.06f, 16f, 13.75f)
            curveTo(16f, 14.44f, 15.44f, 15f, 14.75f, 15f)
            curveTo(14.06f, 15f, 13.5f, 14.44f, 13.5f, 13.75f)
            curveTo(13.5f, 13.06f, 14.06f, 12.5f, 14.75f, 12.5f)
            close()
            moveTo(16.75f, 9f)
            curveTo(17.44f, 9f, 18f, 9.56f, 18f, 10.25f)
            curveTo(18f, 10.94f, 17.44f, 11.5f, 16.75f, 11.5f)
            curveTo(16.06f, 11.5f, 15.5f, 10.94f, 15.5f, 10.25f)
            curveTo(15.5f, 9.56f, 16.06f, 9f, 16.75f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GamesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Games, contentDescription = null)
    }
}

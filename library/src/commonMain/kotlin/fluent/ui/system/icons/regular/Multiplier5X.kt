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

public val FluentIcons.Regular.Multiplier5X: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Multiplier5X",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.002f, 7.7f)
            curveTo(7.028f, 7.306f, 7.355f, 7f, 7.75f, 7f)
            horizontalLineTo(12.25f)
            curveTo(12.664f, 7f, 13f, 7.336f, 13f, 7.75f)
            curveTo(13f, 8.164f, 12.664f, 8.5f, 12.25f, 8.5f)
            horizontalLineTo(8.452f)
            lineTo(8.31f, 10.627f)
            lineTo(9.596f, 10.443f)
            curveTo(11.656f, 10.149f, 13.5f, 11.748f, 13.5f, 13.829f)
            curveTo(13.5f, 15.719f, 11.969f, 17.25f, 10.079f, 17.25f)
            horizontalLineTo(9.724f)
            curveTo(8.659f, 17.25f, 7.643f, 16.8f, 6.928f, 16.011f)
            lineTo(6.694f, 15.754f)
            curveTo(6.416f, 15.447f, 6.439f, 14.973f, 6.746f, 14.694f)
            curveTo(7.053f, 14.416f, 7.527f, 14.439f, 7.806f, 14.746f)
            lineTo(8.039f, 15.003f)
            curveTo(8.47f, 15.479f, 9.082f, 15.75f, 9.724f, 15.75f)
            horizontalLineTo(10.079f)
            curveTo(11.14f, 15.75f, 12f, 14.89f, 12f, 13.829f)
            curveTo(12f, 12.66f, 10.965f, 11.763f, 9.808f, 11.928f)
            lineTo(7.606f, 12.243f)
            curveTo(7.382f, 12.274f, 7.156f, 12.204f, 6.99f, 12.05f)
            curveTo(6.824f, 11.896f, 6.737f, 11.676f, 6.752f, 11.45f)
            lineTo(7.002f, 7.7f)
            close()
            moveTo(14.22f, 12.22f)
            curveTo(14.513f, 11.927f, 14.988f, 11.927f, 15.281f, 12.22f)
            lineTo(16.5f, 13.439f)
            lineTo(17.72f, 12.22f)
            curveTo(18.013f, 11.927f, 18.487f, 11.927f, 18.78f, 12.22f)
            curveTo(19.073f, 12.512f, 19.073f, 12.987f, 18.78f, 13.28f)
            lineTo(17.561f, 14.5f)
            lineTo(18.78f, 15.72f)
            curveTo(19.073f, 16.013f, 19.073f, 16.487f, 18.78f, 16.78f)
            curveTo(18.487f, 17.073f, 18.013f, 17.073f, 17.72f, 16.78f)
            lineTo(16.5f, 15.561f)
            lineTo(15.281f, 16.78f)
            curveTo(14.988f, 17.073f, 14.513f, 17.073f, 14.22f, 16.78f)
            curveTo(13.927f, 16.487f, 13.927f, 16.013f, 14.22f, 15.72f)
            lineTo(15.439f, 14.5f)
            lineTo(14.22f, 13.28f)
            curveTo(13.927f, 12.987f, 13.927f, 12.512f, 14.22f, 12.22f)
            close()
            moveTo(4.75f, 17f)
            curveTo(5.164f, 17f, 5.5f, 16.664f, 5.5f, 16.25f)
            curveTo(5.5f, 15.836f, 5.164f, 15.5f, 4.75f, 15.5f)
            curveTo(4.336f, 15.5f, 4f, 15.836f, 4f, 16.25f)
            curveTo(4f, 16.664f, 4.336f, 17f, 4.75f, 17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Multiplier5XPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Multiplier5X, contentDescription = null)
    }
}

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

public val FluentIcons.Regular.Merge: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Merge",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.75f)
            curveTo(3f, 6.336f, 3.336f, 6f, 3.75f, 6f)
            horizontalLineTo(7.007f)
            curveTo(8.002f, 6f, 8.956f, 6.395f, 9.659f, 7.098f)
            lineTo(12.609f, 10.048f)
            curveTo(13.218f, 10.658f, 14.045f, 11f, 14.907f, 11f)
            horizontalLineTo(19.438f)
            lineTo(15.72f, 7.28f)
            curveTo(15.427f, 6.987f, 15.427f, 6.512f, 15.72f, 6.22f)
            curveTo(16.013f, 5.927f, 16.488f, 5.927f, 16.78f, 6.22f)
            lineTo(21.778f, 11.22f)
            curveTo(22.071f, 11.513f, 22.071f, 11.987f, 21.778f, 12.28f)
            lineTo(16.78f, 17.28f)
            curveTo(16.488f, 17.573f, 16.013f, 17.573f, 15.72f, 17.28f)
            curveTo(15.427f, 16.988f, 15.427f, 16.513f, 15.72f, 16.22f)
            lineTo(19.438f, 12.5f)
            horizontalLineTo(14.967f)
            curveTo(14.076f, 12.5f, 13.225f, 12.866f, 12.611f, 13.512f)
            lineTo(9.931f, 16.333f)
            curveTo(9.223f, 17.078f, 8.24f, 17.5f, 7.212f, 17.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 17.5f, 3f, 17.164f, 3f, 16.75f)
            curveTo(3f, 16.336f, 3.336f, 16f, 3.75f, 16f)
            horizontalLineTo(7.212f)
            curveTo(7.829f, 16f, 8.419f, 15.747f, 8.843f, 15.3f)
            lineTo(11.524f, 12.478f)
            curveTo(11.781f, 12.207f, 12.067f, 11.97f, 12.375f, 11.769f)
            curveTo(12.078f, 11.582f, 11.8f, 11.361f, 11.548f, 11.109f)
            lineTo(8.598f, 8.159f)
            curveTo(8.176f, 7.737f, 7.604f, 7.5f, 7.007f, 7.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 7.5f, 3f, 7.164f, 3f, 6.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MergePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Merge, contentDescription = null)
    }
}

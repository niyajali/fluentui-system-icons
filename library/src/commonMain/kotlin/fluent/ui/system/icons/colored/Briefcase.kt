/**
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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.Briefcase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Briefcase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF163697)
                ),
                start = Offset(7.637f, 2.631f),
                end = Offset(9.95f, 9.253f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13.75f, 2f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            verticalLineTo(6f)
            lineTo(12f, 8.31f)
            lineTo(8f, 6f)
            verticalLineTo(4.25f)
            curveTo(8f, 3.007f, 9.007f, 2f, 10.25f, 2f)
            horizontalLineTo(13.75f)
            close()
            moveTo(10.25f, 3.5f)
            curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
            verticalLineTo(6f)
            horizontalLineTo(14.5f)
            verticalLineTo(4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            horizontalLineTo(10.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(3.643f, 12.688f),
                end = Offset(8.505f, 29.266f)
            )
        ) {
            moveTo(3f, 11f)
            horizontalLineTo(21f)
            verticalLineTo(16.75f)
            curveTo(21f, 18.545f, 19.545f, 20f, 17.75f, 20f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 20f, 3f, 18.545f, 3f, 16.75f)
            verticalLineTo(11f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.337f to Color(0xFF194694),
                    0.747f to Color(0x00367AF2)
                ),
                center = Offset(12f, 11f),
                radius = 9f
            )
        ) {
            moveTo(3f, 11f)
            horizontalLineTo(21f)
            verticalLineTo(16.75f)
            curveTo(21f, 18.545f, 19.545f, 20f, 17.75f, 20f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 20f, 3f, 18.545f, 3f, 16.75f)
            verticalLineTo(11f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF80F1E6),
                    0.552f to Color(0xFF40C4F5),
                    1f to Color(0xFF00A2FA)
                ),
                start = Offset(4.8f, 6.332f),
                end = Offset(13.623f, 16.375f)
            )
        ) {
            moveTo(3f, 9.25f)
            curveTo(3f, 7.455f, 4.455f, 6f, 6.25f, 6f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 6f, 21f, 7.455f, 21f, 9.25f)
            verticalLineTo(12.25f)
            curveTo(21f, 13.217f, 20.216f, 14f, 19.25f, 14f)
            horizontalLineTo(4.75f)
            curveTo(3.783f, 14f, 3f, 13.217f, 3f, 12.25f)
            verticalLineTo(9.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB8F5FF),
                    0.844f to Color(0xFF7CECFF)
                ),
                start = Offset(12f, 11f),
                end = Offset(12f, 15f)
            )
        ) {
            moveTo(13f, 11f)
            horizontalLineTo(11f)
            curveTo(10.448f, 11f, 10f, 11.448f, 10f, 12f)
            verticalLineTo(14f)
            curveTo(10f, 14.552f, 10.448f, 15f, 11f, 15f)
            horizontalLineTo(13f)
            curveTo(13.552f, 15f, 14f, 14.552f, 14f, 14f)
            verticalLineTo(12f)
            curveTo(14f, 11.448f, 13.552f, 11f, 13f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Briefcase, contentDescription = null)
    }
}

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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.PeopleAudience: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleAudience",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.754f, 10f)
            curveTo(15.72f, 10f, 16.504f, 10.783f, 16.504f, 11.75f)
            verticalLineTo(15f)
            horizontalLineTo(16.5f)
            verticalLineTo(16f)
            horizontalLineTo(7.5f)
            verticalLineTo(13f)
            horizontalLineTo(7.502f)
            verticalLineTo(11.75f)
            curveTo(7.502f, 10.783f, 8.285f, 10f, 9.252f, 10f)
            horizontalLineTo(14.754f)
            close()
            moveTo(22f, 11.75f)
            curveTo(22f, 10.783f, 21.216f, 10f, 20.25f, 10f)
            lineTo(16.875f, 9.999f)
            curveTo(17.268f, 10.475f, 17.504f, 11.085f, 17.504f, 11.75f)
            verticalLineTo(13f)
            horizontalLineTo(17.5f)
            verticalLineTo(16f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 16f, 22f, 15.664f, 22f, 15.25f)
            verticalLineTo(11.75f)
            close()
            moveTo(6.5f, 15f)
            horizontalLineTo(6.502f)
            verticalLineTo(11.75f)
            lineTo(6.511f, 11.53f)
            curveTo(6.556f, 10.951f, 6.782f, 10.422f, 7.131f, 9.999f)
            lineTo(3.75f, 10f)
            lineTo(3.606f, 10.006f)
            curveTo(2.707f, 10.079f, 2f, 10.832f, 2f, 11.75f)
            verticalLineTo(15.25f)
            curveTo(2f, 15.664f, 2.336f, 16f, 2.75f, 16f)
            horizontalLineTo(6.5f)
            verticalLineTo(15f)
            close()
            moveTo(12f, 3f)
            curveTo(13.657f, 3f, 15f, 4.343f, 15f, 6f)
            curveTo(15f, 7.657f, 13.657f, 9f, 12f, 9f)
            curveTo(10.343f, 9f, 9f, 7.657f, 9f, 6f)
            curveTo(9f, 4.343f, 10.343f, 3f, 12f, 3f)
            close()
            moveTo(18.5f, 4f)
            curveTo(19.881f, 4f, 21f, 5.119f, 21f, 6.5f)
            curveTo(21f, 7.881f, 19.881f, 9f, 18.5f, 9f)
            curveTo(17.119f, 9f, 16f, 7.881f, 16f, 6.5f)
            curveTo(16f, 5.119f, 17.119f, 4f, 18.5f, 4f)
            close()
            moveTo(5.5f, 4f)
            curveTo(6.881f, 4f, 8f, 5.119f, 8f, 6.5f)
            curveTo(8f, 7.881f, 6.881f, 9f, 5.5f, 9f)
            curveTo(4.119f, 9f, 3f, 7.881f, 3f, 6.5f)
            curveTo(3f, 5.119f, 4.119f, 4f, 5.5f, 4f)
            close()
            moveTo(2f, 17.75f)
            curveTo(2f, 17.336f, 2.336f, 17f, 2.75f, 17f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 17f, 22f, 17.336f, 22f, 17.75f)
            verticalLineTo(18.25f)
            curveTo(22f, 20.321f, 20.321f, 22f, 18.25f, 22f)
            horizontalLineTo(5.75f)
            curveTo(3.679f, 22f, 2f, 20.321f, 2f, 18.25f)
            verticalLineTo(17.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleAudiencePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PeopleAudience, contentDescription = null)
    }
}

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

public val FluentIcons.Filled.FilmstripPlay: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FilmstripPlay",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 20f, 22f, 18.545f, 22f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(5.25f)
            close()
            moveTo(19.25f, 7f)
            curveTo(19.664f, 7f, 20f, 7.336f, 20f, 7.75f)
            verticalLineTo(8.25f)
            curveTo(20f, 8.664f, 19.664f, 9f, 19.25f, 9f)
            curveTo(18.836f, 9f, 18.5f, 8.664f, 18.5f, 8.25f)
            verticalLineTo(7.75f)
            curveTo(18.5f, 7.336f, 18.836f, 7f, 19.25f, 7f)
            close()
            moveTo(18.5f, 15.75f)
            curveTo(18.5f, 15.336f, 18.836f, 15f, 19.25f, 15f)
            curveTo(19.664f, 15f, 20f, 15.336f, 20f, 15.75f)
            verticalLineTo(16.25f)
            curveTo(20f, 16.664f, 19.664f, 17f, 19.25f, 17f)
            curveTo(18.836f, 17f, 18.5f, 16.664f, 18.5f, 16.25f)
            verticalLineTo(15.75f)
            close()
            moveTo(19.25f, 11f)
            curveTo(19.664f, 11f, 20f, 11.336f, 20f, 11.75f)
            verticalLineTo(12.25f)
            curveTo(20f, 12.664f, 19.664f, 13f, 19.25f, 13f)
            curveTo(18.836f, 13f, 18.5f, 12.664f, 18.5f, 12.25f)
            verticalLineTo(11.75f)
            curveTo(18.5f, 11.336f, 18.836f, 11f, 19.25f, 11f)
            close()
            moveTo(4f, 7.75f)
            curveTo(4f, 7.336f, 4.336f, 7f, 4.75f, 7f)
            curveTo(5.164f, 7f, 5.5f, 7.336f, 5.5f, 7.75f)
            verticalLineTo(8.25f)
            curveTo(5.5f, 8.664f, 5.164f, 9f, 4.75f, 9f)
            curveTo(4.336f, 9f, 4f, 8.664f, 4f, 8.25f)
            verticalLineTo(7.75f)
            close()
            moveTo(4.75f, 15f)
            curveTo(5.164f, 15f, 5.5f, 15.336f, 5.5f, 15.75f)
            verticalLineTo(16.25f)
            curveTo(5.5f, 16.664f, 5.164f, 17f, 4.75f, 17f)
            curveTo(4.336f, 17f, 4f, 16.664f, 4f, 16.25f)
            verticalLineTo(15.75f)
            curveTo(4f, 15.336f, 4.336f, 15f, 4.75f, 15f)
            close()
            moveTo(4f, 11.75f)
            curveTo(4f, 11.336f, 4.336f, 11f, 4.75f, 11f)
            curveTo(5.164f, 11f, 5.5f, 11.336f, 5.5f, 11.75f)
            verticalLineTo(12.25f)
            curveTo(5.5f, 12.664f, 5.164f, 13f, 4.75f, 13f)
            curveTo(4.336f, 13f, 4f, 12.664f, 4f, 12.25f)
            verticalLineTo(11.75f)
            close()
            moveTo(10f, 9.751f)
            curveTo(10f, 9.172f, 10.576f, 8.811f, 11.035f, 9.104f)
            lineTo(14.709f, 11.447f)
            curveTo(15.097f, 11.694f, 15.097f, 12.306f, 14.709f, 12.553f)
            lineTo(11.034f, 14.896f)
            curveTo(10.576f, 15.189f, 10f, 14.828f, 10f, 14.249f)
            verticalLineTo(9.751f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FilmstripPlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FilmstripPlay, contentDescription = null)
    }
}

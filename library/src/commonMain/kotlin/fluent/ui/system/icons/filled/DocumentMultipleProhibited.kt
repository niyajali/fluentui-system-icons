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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.DocumentMultipleProhibited: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentMultipleProhibited",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 6.75f)
            verticalLineTo(2f)
            horizontalLineTo(8.75f)
            curveTo(7.507f, 2f, 6.5f, 3.007f, 6.5f, 4.25f)
            verticalLineTo(11f)
            curveTo(10.09f, 11f, 13f, 13.91f, 13f, 17.5f)
            curveTo(13f, 18.198f, 12.89f, 18.87f, 12.686f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 19.5f, 20f, 18.493f, 20f, 17.25f)
            verticalLineTo(9f)
            horizontalLineTo(15.25f)
            curveTo(14.007f, 9f, 13f, 7.993f, 13f, 6.75f)
            close()
            moveTo(5.503f, 4.627f)
            lineTo(5.501f, 11.076f)
            curveTo(4.978f, 11.157f, 4.475f, 11.3f, 4f, 11.498f)
            verticalLineTo(6.75f)
            curveTo(4f, 5.769f, 4.627f, 4.935f, 5.503f, 4.627f)
            close()
            moveTo(15.244f, 22.004f)
            horizontalLineTo(11.186f)
            curveTo(11.613f, 21.56f, 11.978f, 21.055f, 12.266f, 20.504f)
            lineTo(17.366f, 20.504f)
            curveTo(17.057f, 21.378f, 16.224f, 22.004f, 15.244f, 22.004f)
            close()
            moveTo(14.5f, 6.75f)
            verticalLineTo(2.5f)
            lineTo(19.5f, 7.5f)
            horizontalLineTo(15.25f)
            curveTo(14.836f, 7.5f, 14.5f, 7.164f, 14.5f, 6.75f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            close()
            moveTo(2.5f, 17.5f)
            curveTo(2.5f, 18.333f, 2.755f, 19.108f, 3.191f, 19.748f)
            lineTo(8.748f, 14.191f)
            curveTo(8.108f, 13.755f, 7.334f, 13.5f, 6.5f, 13.5f)
            curveTo(4.291f, 13.5f, 2.5f, 15.291f, 2.5f, 17.5f)
            close()
            moveTo(6.5f, 21.5f)
            curveTo(8.709f, 21.5f, 10.5f, 19.709f, 10.5f, 17.5f)
            curveTo(10.5f, 16.667f, 10.245f, 15.892f, 9.809f, 15.252f)
            lineTo(4.252f, 20.809f)
            curveTo(4.892f, 21.245f, 5.666f, 21.5f, 6.5f, 21.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentMultipleProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentMultipleProhibited, contentDescription = null)
    }
}

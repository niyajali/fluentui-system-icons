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

public val FluentUi.Filled.Cast: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cast",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.25f, 4f)
            curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(2f, 18.993f, 3.007f, 20f, 4.25f, 20f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 20f, 22f, 18.993f, 22f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(22f, 5.007f, 20.993f, 4f, 19.75f, 4f)
            horizontalLineTo(4.25f)
            close()
            moveTo(5.746f, 8.994f)
            curveTo(9.752f, 8.994f, 13f, 12.241f, 13f, 16.248f)
            curveTo(13f, 16.662f, 12.664f, 16.998f, 12.25f, 16.998f)
            curveTo(11.835f, 16.998f, 11.5f, 16.662f, 11.5f, 16.248f)
            curveTo(11.5f, 13.07f, 8.924f, 10.494f, 5.746f, 10.494f)
            curveTo(5.332f, 10.494f, 4.996f, 10.158f, 4.996f, 9.744f)
            curveTo(4.996f, 9.33f, 5.332f, 8.994f, 5.746f, 8.994f)
            close()
            moveTo(4.996f, 12.751f)
            curveTo(4.996f, 12.336f, 5.332f, 12.001f, 5.746f, 12.001f)
            curveTo(8.091f, 12.001f, 9.993f, 13.902f, 9.993f, 16.248f)
            curveTo(9.993f, 16.662f, 9.657f, 16.998f, 9.243f, 16.998f)
            curveTo(8.829f, 16.998f, 8.493f, 16.662f, 8.493f, 16.248f)
            curveTo(8.493f, 14.731f, 7.263f, 13.501f, 5.746f, 13.501f)
            curveTo(5.332f, 13.501f, 4.996f, 13.165f, 4.996f, 12.751f)
            close()
            moveTo(6.996f, 15.995f)
            curveTo(6.996f, 16.547f, 6.549f, 16.993f, 5.998f, 16.993f)
            curveTo(5.447f, 16.993f, 5f, 16.547f, 5f, 15.995f)
            curveTo(5f, 15.444f, 5.447f, 14.998f, 5.998f, 14.998f)
            curveTo(6.549f, 14.998f, 6.996f, 15.444f, 6.996f, 15.995f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CastPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Cast, contentDescription = null)
    }
}

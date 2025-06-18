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

public val FluentUi.Filled.PhonePagination: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhonePagination",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.75f, 2f)
            curveTo(16.993f, 2f, 18f, 3.007f, 18f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18f, 20.993f, 16.993f, 22f, 15.75f, 22f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
            horizontalLineTo(15.75f)
            close()
            moveTo(9.499f, 17.762f)
            curveTo(9.085f, 17.762f, 8.749f, 18.098f, 8.749f, 18.512f)
            curveTo(8.749f, 18.926f, 9.085f, 19.262f, 9.499f, 19.262f)
            curveTo(9.913f, 19.262f, 10.249f, 18.926f, 10.249f, 18.512f)
            curveTo(10.249f, 18.098f, 9.913f, 17.762f, 9.499f, 17.762f)
            close()
            moveTo(11.999f, 17.762f)
            curveTo(11.585f, 17.762f, 11.249f, 18.098f, 11.249f, 18.512f)
            curveTo(11.249f, 18.926f, 11.585f, 19.262f, 11.999f, 19.262f)
            curveTo(12.413f, 19.262f, 12.749f, 18.926f, 12.749f, 18.512f)
            curveTo(12.749f, 18.098f, 12.413f, 17.762f, 11.999f, 17.762f)
            close()
            moveTo(14.499f, 17.762f)
            curveTo(14.085f, 17.762f, 13.749f, 18.098f, 13.749f, 18.512f)
            curveTo(13.749f, 18.926f, 14.085f, 19.262f, 14.499f, 19.262f)
            curveTo(14.913f, 19.262f, 15.249f, 18.926f, 15.249f, 18.512f)
            curveTo(15.249f, 18.098f, 14.913f, 17.762f, 14.499f, 17.762f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhonePaginationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PhonePagination, contentDescription = null)
    }
}

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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.Spacebar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Spacebar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.5f, 11f)
            verticalLineTo(13f)
            curveTo(20.5f, 13.138f, 20.388f, 13.25f, 20.25f, 13.25f)
            horizontalLineTo(3.75f)
            curveTo(3.612f, 13.25f, 3.5f, 13.138f, 3.5f, 13f)
            verticalLineTo(11f)
            curveTo(3.5f, 10.586f, 3.164f, 10.25f, 2.75f, 10.25f)
            curveTo(2.336f, 10.25f, 2f, 10.586f, 2f, 11f)
            curveTo(2f, 11.444f, 2f, 12.111f, 2f, 13f)
            curveTo(2f, 13.967f, 2.783f, 14.75f, 3.75f, 14.75f)
            horizontalLineTo(20.25f)
            curveTo(21.216f, 14.75f, 22f, 13.967f, 22f, 13f)
            verticalLineTo(11f)
            curveTo(22f, 10.586f, 21.664f, 10.25f, 21.25f, 10.25f)
            curveTo(20.836f, 10.25f, 20.5f, 10.586f, 20.5f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SpacebarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Spacebar, contentDescription = null)
    }
}

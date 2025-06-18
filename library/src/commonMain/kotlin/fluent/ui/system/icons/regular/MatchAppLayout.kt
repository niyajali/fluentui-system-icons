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

public val FluentIcons.Regular.MatchAppLayout: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MatchAppLayout",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.282f, 8f)
            curveTo(10.248f, 8f, 11.032f, 8.783f, 11.032f, 9.75f)
            verticalLineTo(14.25f)
            curveTo(11.032f, 15.217f, 10.248f, 16f, 9.282f, 16f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 16f, 2f, 15.217f, 2f, 14.25f)
            verticalLineTo(9.75f)
            curveTo(2f, 8.832f, 2.707f, 8.079f, 3.606f, 8.006f)
            lineTo(3.75f, 8f)
            horizontalLineTo(9.282f)
            close()
            moveTo(20.25f, 8f)
            curveTo(21.216f, 8f, 22f, 8.783f, 22f, 9.75f)
            verticalLineTo(14.25f)
            curveTo(22f, 15.217f, 21.216f, 16f, 20.25f, 16f)
            horizontalLineTo(14.718f)
            curveTo(13.752f, 16f, 12.968f, 15.217f, 12.968f, 14.25f)
            verticalLineTo(9.75f)
            curveTo(12.968f, 8.783f, 13.752f, 8f, 14.718f, 8f)
            horizontalLineTo(20.25f)
            close()
            moveTo(9.282f, 9.5f)
            horizontalLineTo(3.75f)
            lineTo(3.693f, 9.507f)
            curveTo(3.582f, 9.533f, 3.5f, 9.632f, 3.5f, 9.75f)
            verticalLineTo(14.25f)
            curveTo(3.5f, 14.388f, 3.612f, 14.5f, 3.75f, 14.5f)
            horizontalLineTo(9.282f)
            curveTo(9.42f, 14.5f, 9.532f, 14.388f, 9.532f, 14.25f)
            verticalLineTo(9.75f)
            curveTo(9.532f, 9.612f, 9.42f, 9.5f, 9.282f, 9.5f)
            close()
            moveTo(20.25f, 9.5f)
            horizontalLineTo(14.718f)
            curveTo(14.58f, 9.5f, 14.468f, 9.612f, 14.468f, 9.75f)
            verticalLineTo(14.25f)
            curveTo(14.468f, 14.388f, 14.58f, 14.5f, 14.718f, 14.5f)
            horizontalLineTo(20.25f)
            curveTo(20.388f, 14.5f, 20.5f, 14.388f, 20.5f, 14.25f)
            verticalLineTo(9.75f)
            curveTo(20.5f, 9.612f, 20.388f, 9.5f, 20.25f, 9.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MatchAppLayoutPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MatchAppLayout, contentDescription = null)
    }
}

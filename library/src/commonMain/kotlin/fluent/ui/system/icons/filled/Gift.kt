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

public val FluentIcons.Filled.Gift: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Gift",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.25f, 13f)
            verticalLineTo(22f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 22f, 4f, 20.545f, 4f, 18.75f)
            verticalLineTo(13f)
            horizontalLineTo(11.25f)
            close()
            moveTo(20f, 13f)
            verticalLineTo(18.75f)
            curveTo(20f, 20.545f, 18.545f, 22f, 16.75f, 22f)
            horizontalLineTo(12.75f)
            verticalLineTo(13f)
            horizontalLineTo(20f)
            close()
            moveTo(14.5f, 2f)
            curveTo(16.295f, 2f, 17.75f, 3.455f, 17.75f, 5.25f)
            curveTo(17.75f, 5.895f, 17.562f, 6.496f, 17.238f, 7.002f)
            lineTo(19.75f, 7f)
            curveTo(20.44f, 7f, 21f, 7.466f, 21f, 8.042f)
            verticalLineTo(10.958f)
            curveTo(21f, 11.534f, 20.44f, 12f, 19.75f, 12f)
            lineTo(12.75f, 11.999f)
            verticalLineTo(7f)
            horizontalLineTo(11.25f)
            verticalLineTo(11.999f)
            lineTo(4.25f, 12f)
            curveTo(3.56f, 12f, 3f, 11.534f, 3f, 10.958f)
            verticalLineTo(8.042f)
            curveTo(3f, 7.466f, 3.56f, 7f, 4.25f, 7f)
            lineTo(6.762f, 7.002f)
            curveTo(6.438f, 6.496f, 6.25f, 5.895f, 6.25f, 5.25f)
            curveTo(6.25f, 3.455f, 7.705f, 2f, 9.5f, 2f)
            curveTo(10.505f, 2f, 11.404f, 2.457f, 12.001f, 3.174f)
            curveTo(12.596f, 2.457f, 13.495f, 2f, 14.5f, 2f)
            close()
            moveTo(9.5f, 3.5f)
            curveTo(8.533f, 3.5f, 7.75f, 4.284f, 7.75f, 5.25f)
            curveTo(7.75f, 6.168f, 8.457f, 6.921f, 9.356f, 6.994f)
            lineTo(9.5f, 7f)
            horizontalLineTo(11.25f)
            verticalLineTo(5.25f)
            lineTo(11.244f, 5.106f)
            curveTo(11.171f, 4.207f, 10.418f, 3.5f, 9.5f, 3.5f)
            close()
            moveTo(14.5f, 3.5f)
            curveTo(13.533f, 3.5f, 12.75f, 4.284f, 12.75f, 5.25f)
            verticalLineTo(7f)
            horizontalLineTo(14.5f)
            curveTo(15.467f, 7f, 16.25f, 6.216f, 16.25f, 5.25f)
            curveTo(16.25f, 4.284f, 15.467f, 3.5f, 14.5f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GiftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Gift, contentDescription = null)
    }
}

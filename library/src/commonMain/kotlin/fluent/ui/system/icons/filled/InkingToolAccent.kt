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

public val FluentIcons.Filled.InkingToolAccent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.InkingToolAccent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 7f)
            horizontalLineTo(20.25f)
            curveTo(20.368f, 7f, 20.468f, 6.918f, 20.493f, 6.807f)
            lineTo(20.5f, 6.75f)
            verticalLineTo(3f)
            lineTo(3.75f, 3f)
            verticalLineTo(6.75f)
            curveTo(3.75f, 6.868f, 3.832f, 6.967f, 3.943f, 6.993f)
            lineTo(4f, 7f)
            close()
            moveTo(11.976f, 13.946f)
            lineTo(14.617f, 7.999f)
            lineTo(15.5f, 7.5f)
            lineTo(16.258f, 7.999f)
            lineTo(13.347f, 14.555f)
            curveTo(13.226f, 14.825f, 12.958f, 15f, 12.661f, 15f)
            curveTo(12.119f, 15f, 11.756f, 14.442f, 11.976f, 13.946f)
            close()
            moveTo(13f, 19f)
            curveTo(13f, 20.105f, 12.552f, 21f, 12f, 21f)
            curveTo(11.448f, 21f, 11f, 20.105f, 11f, 19f)
            curveTo(11f, 17.895f, 11.448f, 17f, 12f, 17f)
            curveTo(12.552f, 17f, 13f, 17.895f, 13f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun InkingToolAccentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.InkingToolAccent, contentDescription = null)
    }
}

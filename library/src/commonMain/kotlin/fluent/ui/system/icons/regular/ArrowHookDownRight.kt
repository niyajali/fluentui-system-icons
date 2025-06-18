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

public val FluentIcons.Regular.ArrowHookDownRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookDownRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 5.5f)
            horizontalLineTo(16f)
            curveTo(16.414f, 5.5f, 16.75f, 5.164f, 16.75f, 4.75f)
            curveTo(16.75f, 4.336f, 16.414f, 4f, 16f, 4f)
            horizontalLineTo(10.5f)
            curveTo(6.91f, 4f, 4f, 6.91f, 4f, 10.5f)
            curveTo(4f, 14.09f, 6.91f, 17f, 10.5f, 17f)
            horizontalLineTo(16.45f)
            lineTo(13.834f, 19.617f)
            curveTo(13.541f, 19.91f, 13.541f, 20.385f, 13.834f, 20.677f)
            curveTo(14.126f, 20.97f, 14.601f, 20.97f, 14.894f, 20.677f)
            lineTo(18.777f, 16.795f)
            curveTo(18.876f, 16.695f, 18.942f, 16.575f, 18.974f, 16.447f)
            curveTo(18.991f, 16.385f, 19f, 16.318f, 19f, 16.25f)
            curveTo(19f, 16.037f, 18.911f, 15.845f, 18.769f, 15.708f)
            lineTo(14.889f, 11.828f)
            curveTo(14.596f, 11.535f, 14.121f, 11.535f, 13.828f, 11.828f)
            curveTo(13.535f, 12.121f, 13.535f, 12.596f, 13.828f, 12.889f)
            lineTo(16.439f, 15.5f)
            horizontalLineTo(10.5f)
            curveTo(7.739f, 15.5f, 5.5f, 13.261f, 5.5f, 10.5f)
            curveTo(5.5f, 7.739f, 7.739f, 5.5f, 10.5f, 5.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowHookDownRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowHookDownRight, contentDescription = null)
    }
}

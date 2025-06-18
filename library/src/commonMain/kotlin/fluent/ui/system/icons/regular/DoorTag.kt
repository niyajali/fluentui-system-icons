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

public val FluentIcons.Regular.DoorTag: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DoorTag",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.75f, 17.5f)
            curveTo(9.336f, 17.5f, 9f, 17.836f, 9f, 18.25f)
            curveTo(9f, 18.664f, 9.336f, 19f, 9.75f, 19f)
            horizontalLineTo(14.25f)
            curveTo(14.664f, 19f, 15f, 18.664f, 15f, 18.25f)
            curveTo(15f, 17.836f, 14.664f, 17.5f, 14.25f, 17.5f)
            horizontalLineTo(9.75f)
            close()
            moveTo(10.799f, 7.101f)
            curveTo(11.076f, 6.732f, 11.511f, 6.5f, 12f, 6.5f)
            curveTo(12.828f, 6.5f, 13.5f, 7.172f, 13.5f, 8f)
            curveTo(13.5f, 8.828f, 12.828f, 9.5f, 12f, 9.5f)
            horizontalLineTo(8f)
            curveTo(6.895f, 9.5f, 6f, 10.395f, 6f, 11.5f)
            verticalLineTo(20f)
            curveTo(6f, 21.105f, 6.895f, 22f, 8f, 22f)
            horizontalLineTo(16f)
            curveTo(17.105f, 22f, 18f, 21.105f, 18f, 20f)
            verticalLineTo(8f)
            curveTo(18f, 4.686f, 15.314f, 2f, 12f, 2f)
            curveTo(10.036f, 2f, 8.292f, 2.946f, 7.201f, 4.398f)
            curveTo(6.455f, 5.392f, 6.655f, 6.802f, 7.648f, 7.548f)
            curveTo(8.642f, 8.295f, 10.052f, 8.095f, 10.799f, 7.101f)
            close()
            moveTo(12f, 5f)
            curveTo(11.022f, 5f, 10.15f, 5.468f, 9.6f, 6.2f)
            curveTo(9.351f, 6.531f, 8.881f, 6.598f, 8.549f, 6.349f)
            curveTo(8.218f, 6.1f, 8.152f, 5.63f, 8.4f, 5.299f)
            curveTo(9.221f, 4.208f, 10.528f, 3.5f, 12f, 3.5f)
            curveTo(14.485f, 3.5f, 16.5f, 5.515f, 16.5f, 8f)
            verticalLineTo(20f)
            curveTo(16.5f, 20.276f, 16.276f, 20.5f, 16f, 20.5f)
            horizontalLineTo(8f)
            curveTo(7.724f, 20.5f, 7.5f, 20.276f, 7.5f, 20f)
            verticalLineTo(11.5f)
            curveTo(7.5f, 11.224f, 7.724f, 11f, 8f, 11f)
            horizontalLineTo(12f)
            curveTo(13.657f, 11f, 15f, 9.657f, 15f, 8f)
            curveTo(15f, 6.343f, 13.657f, 5f, 12f, 5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DoorTagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DoorTag, contentDescription = null)
    }
}

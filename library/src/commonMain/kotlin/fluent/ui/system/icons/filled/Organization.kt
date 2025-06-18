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

public val FluentIcons.Filled.Organization: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Organization",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.998f, 5.75f)
            curveTo(7.998f, 3.678f, 9.678f, 1.998f, 11.75f, 1.998f)
            curveTo(13.822f, 1.998f, 15.502f, 3.678f, 15.502f, 5.75f)
            curveTo(15.502f, 7.566f, 14.213f, 9.08f, 12.5f, 9.428f)
            verticalLineTo(11.5f)
            horizontalLineTo(15.75f)
            curveTo(16.993f, 11.5f, 18f, 12.508f, 18f, 13.75f)
            verticalLineTo(14.575f)
            curveTo(19.714f, 14.921f, 21.005f, 16.436f, 21.005f, 18.253f)
            curveTo(21.005f, 20.325f, 19.325f, 22.005f, 17.252f, 22.005f)
            curveTo(15.18f, 22.005f, 13.5f, 20.325f, 13.5f, 18.253f)
            curveTo(13.5f, 16.438f, 14.788f, 14.924f, 16.5f, 14.576f)
            verticalLineTo(13.75f)
            curveTo(16.5f, 13.336f, 16.164f, 13f, 15.75f, 13f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 13f, 7f, 13.336f, 7f, 13.75f)
            verticalLineTo(14.575f)
            curveTo(8.714f, 14.921f, 10.005f, 16.436f, 10.005f, 18.253f)
            curveTo(10.005f, 20.325f, 8.325f, 22.005f, 6.252f, 22.005f)
            curveTo(4.18f, 22.005f, 2.5f, 20.325f, 2.5f, 18.253f)
            curveTo(2.5f, 16.438f, 3.788f, 14.924f, 5.5f, 14.576f)
            verticalLineTo(13.75f)
            curveTo(5.5f, 12.508f, 6.507f, 11.5f, 7.75f, 11.5f)
            horizontalLineTo(11f)
            verticalLineTo(9.428f)
            curveTo(9.287f, 9.08f, 7.998f, 7.566f, 7.998f, 5.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun OrganizationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Organization, contentDescription = null)
    }
}

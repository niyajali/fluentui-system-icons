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

public val FluentIcons.Regular.Feed: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Feed",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.528f, 7.75f)
            curveTo(6.528f, 8.164f, 6.193f, 8.5f, 5.778f, 8.5f)
            curveTo(5.364f, 8.5f, 5.028f, 8.164f, 5.028f, 7.75f)
            curveTo(5.028f, 7.336f, 5.364f, 7f, 5.778f, 7f)
            curveTo(6.193f, 7f, 6.528f, 7.336f, 6.528f, 7.75f)
            close()
            moveTo(5.781f, 15f)
            curveTo(5.367f, 15f, 5.031f, 15.336f, 5.031f, 15.75f)
            curveTo(5.031f, 16.164f, 5.367f, 16.5f, 5.781f, 16.5f)
            horizontalLineTo(10.781f)
            curveTo(11.196f, 16.5f, 11.531f, 16.164f, 11.531f, 15.75f)
            curveTo(11.531f, 15.336f, 11.196f, 15f, 10.781f, 15f)
            horizontalLineTo(5.781f)
            close()
            moveTo(5.031f, 11.75f)
            curveTo(5.031f, 11.336f, 5.367f, 11f, 5.781f, 11f)
            horizontalLineTo(10.781f)
            curveTo(11.196f, 11f, 11.531f, 11.336f, 11.531f, 11.75f)
            curveTo(11.531f, 12.164f, 11.196f, 12.5f, 10.781f, 12.5f)
            horizontalLineTo(5.781f)
            curveTo(5.367f, 12.5f, 5.031f, 12.164f, 5.031f, 11.75f)
            close()
            moveTo(15f, 21f)
            curveTo(15.941f, 20.994f, 16.749f, 20.327f, 16.934f, 19.403f)
            lineTo(17.415f, 17f)
            horizontalLineTo(20.25f)
            curveTo(21.216f, 17f, 22f, 16.216f, 22f, 15.25f)
            verticalLineTo(9.261f)
            curveTo(22f, 8.016f, 20.994f, 7.006f, 19.75f, 7f)
            verticalLineTo(6.996f)
            horizontalLineTo(14.5f)
            verticalLineTo(5.25f)
            curveTo(14.5f, 4.007f, 13.493f, 3f, 12.25f, 3f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 3f, 2f, 4.007f, 2f, 5.25f)
            verticalLineTo(17.75f)
            curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
            horizontalLineTo(14.986f)
            lineTo(15f, 21f)
            close()
            moveTo(3.5f, 5.25f)
            curveTo(3.5f, 4.836f, 3.836f, 4.5f, 4.25f, 4.5f)
            horizontalLineTo(12.25f)
            curveTo(12.664f, 4.5f, 13f, 4.836f, 13f, 5.25f)
            verticalLineTo(19.014f)
            curveTo(13f, 19.181f, 13.021f, 19.344f, 13.06f, 19.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 19.5f, 3.5f, 18.716f, 3.5f, 17.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(14.5f, 8.496f)
            horizontalLineTo(17.611f)
            curveTo(17.574f, 8.6f, 17.544f, 8.707f, 17.522f, 8.818f)
            lineTo(15.463f, 19.109f)
            curveTo(15.418f, 19.336f, 15.218f, 19.5f, 14.986f, 19.5f)
            curveTo(14.718f, 19.5f, 14.5f, 19.282f, 14.5f, 19.014f)
            verticalLineTo(8.496f)
            close()
            moveTo(18.993f, 9.112f)
            curveTo(19.064f, 8.756f, 19.376f, 8.5f, 19.739f, 8.5f)
            curveTo(20.159f, 8.5f, 20.5f, 8.841f, 20.5f, 9.261f)
            verticalLineTo(15.25f)
            curveTo(20.5f, 15.388f, 20.388f, 15.5f, 20.25f, 15.5f)
            horizontalLineTo(17.715f)
            lineTo(18.993f, 9.112f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FeedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Feed, contentDescription = null)
    }
}
